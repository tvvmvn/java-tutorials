package oop.oop04practices.eg95proxy;

import java.time.LocalDateTime;

// =============================================================================
// 1. 주체 인터페이스 (Subject - 실제 객체와 대리 객체가 모두 따라야 하는 규격)
// =============================================================================
interface ImageService {
  void displayImage(String filename, String userRole);
}

// =============================================================================
// 2. 실제 주체 클래스 (Real Subject - 실제 핵심 비즈니스 로직을 수행, 무거운 객체)
// =============================================================================
class HighResolutionImage implements ImageService {

  private final String filename;

  public HighResolutionImage(String filename) {
    this.filename = filename;
    // 생성 시점에 디스크 I/O가 발생한다고 가정 (매우 무거운 작업)
    loadFromDisk();
  }

  private void loadFromDisk() {
    System.out.println("  └ 💾 [디스크 I/O] 헤비 헤드 리더기 가동 -> 대용량 파일 [" + filename + "]을 메모리에 로드 중입니다... (0.5초 소요)");
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  @Override
  public void displayImage(String filename, String userRole) {
    // 순수한 렌더링 기능에만 집중되어 있음 (보안이나 캐싱 코드가 없어 깔끔함 - SRP 준수)
    System.out.println("  └ 🖥️ [렌더링] 고해상도 이미지 [" + filename + "]를 화면에 비트맵 출력합니다.");
  }
}

// =============================================================================
// 3. 프록시 클래스 (Proxy - 중간에서 접근을 제어하고 부가 기능을 래핑하는 대리인)
// =============================================================================
class ImageProxy implements ImageService {

  private final String filename;
  // 진짜 객체의 참조를 들고 있음 (Composition)
  private HighResolutionImage realImage;

  public ImageProxy(String filename) {
    this.filename = filename;
  }

  @Override
  public void displayImage(String filename, String userRole) {
    System.out.println(String.format("[%s] [프록시] 이미지 접근 제어 허가 요청 감지. (파일명: %s)", LocalDateTime.now(), filename));

    // 부가 기능 1: 보안 및 권한 체크 (Access Control)
    if (!"PREMIUM_USER".equalsIgnoreCase(userRole) && !"ADMIN".equalsIgnoreCase(userRole)) {
      System.err.println("  ❌ [보안 차단] 거부: 고해상도 이미지는 프리미엄 등급 회원만 열람할 수 있습니다.\n");
      return;
    }

    // 부가 기능 2: 캐싱 및 지연 로딩 (Lazy Initialization & Caching)
    // 요청이 들어오고 보안이 통과된 '이 시점'에 진짜 객체가 없으면 최초 1번만 무겁게 생성합니다.
    if (realImage == null) {
      System.out.println("  💡 [캐시 미스] 최초 요청이므로 물리 디스크에서 인스턴스를 초기화합니다.");
      realImage = new HighResolutionImage(this.filename);
    } else {
      System.out.println("  ✨ [캐시 히트] 이미 메모리에 로드된 기존 이미지 인스턴스를 재사용합니다.");
    }

    // 3. 권한과 캐싱 검사가 끝나면 실제 객체에 처리를 위임(Delegation)합니다.
    realImage.displayImage(filename, userRole);
    System.out.println();
  }
}

// =============================================================================
// 4. 클라이언트 실행 및 일괄 처리 테스트 (배열 루프 활용)
// =============================================================================
public class Main {
  public static void main(String[] args) {
    System.out.println("=== 스마트 프록시 인프라 가동 테스트 ===\n");

    // 클라이언트는 실제 객체를 직접 다루지 않고 가벼운 프록시 인터페이스를 배열에 담아 준비합니다.
    // 이 시점에는 실제 디스크 로딩이 일어나지 않으므로 서버 메모리가 낭비되지 않습니다.
    ImageService[] imageGallery = {
        new ImageProxy("deep_space_nebula.raw"),
        new ImageProxy("ocean_deep_trench.raw")
    };

    // 시나리오 1: 일반 등급 유저(BASIC)가 첫 번째 이미지 열람 시도
    System.out.println("--- [테스트 1] 일반 등급 유저의 첫 접근 ---");
    imageGallery[0].displayImage("deep_space_nebula.raw", "BASIC"); // 권한 부족으로 즉시 차단되어야 함

    // 시나리오 2: 프리미엄 유저(PREMIUM_USER)가 첫 번째 이미지 열람 시도 (최초 로딩 발생)
    System.out.println("--- [테스트 2] 프리미엄 등급 유저의 첫 접근 (물리 로딩 트리거) ---");
    imageGallery[0].displayImage("deep_space_nebula.raw", "PREMIUM_USER"); // 디스크 로딩 후 출력 성공해야 함

    // 시나리오 3: 또 다른 권한자(ADMIN)가 동일한 첫 번째 이미지 재열람 시도 (캐시 작동)
    System.out.println("--- [테스트 3] 다른 권한자의 동일 이미지 재요청 (캐시 성능 향상 확인) ---");
    imageGallery[0].displayImage("deep_space_nebula.raw", "ADMIN"); // 디스크 로딩 없이 즉시 렌더링되어야 함
  }
}
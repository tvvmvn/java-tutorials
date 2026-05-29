package _archive.adapterwebimage;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

interface WebBrowserImage {
  void render();
}

// 1. 실제 인터넷망을 통해 다운로드해야 하는 원본 이미지 (Real Subject)
class RemoteNetworkImage implements WebBrowserImage {
  private final String url;

  public RemoteNetworkImage(String url) {
    this.url = url;
    downloadFromInternet();
  }

  private void downloadFromInternet() {
    System.out.println("  🌐 [인터넷 대역폭 사용] 통신 기지국을 거쳐 해외 서버로부터 '" + url + "' 데이터를 다운로드 중... (1.2초 소요)");
    try {
      Thread.sleep(1200);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  @Override
  public void render() {
    System.out.println("  🖥️ [모니터 출력] 모니터 픽셀에 웹 이미지를 선명하게 렌더링합니다.");
  }
}

// 2. 내 컴퓨터 브라우저 내부의 캐시 관리자 (Proxy)
class ChromeImageCacheProxy implements WebBrowserImage {
  private final String url;

  // 내 컴퓨터 하드디스크 임시 폴더에 저장된 파일 정보와 다운로드 시간 기록 저장소
  private static final Map<String, RemoteNetworkImage> localDiskCache = new HashMap<>();
  private static final Map<String, LocalDateTime> cacheTimestamps = new HashMap<>();

  // 웹 브라우저의 일반적인 이미지 캐시 유효기간 (시뮬레이션을 위해 3초로 설정)
  private final Duration browserCacheTTL = Duration.ofSeconds(3);

  public ChromeImageCacheProxy(String url) {
    this.url = url;
  }

  @Override
  public void render() {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(String.format("[%s] [크롬 브라우저] 사용자가 웹 페이지 '%s'에 진입했습니다.", now, url));

    boolean isExpired = false;

    if (localDiskCache.containsKey(url)) {
      long passedSeconds = Duration.between(cacheTimestamps.get(url), now).toSeconds();
      if (passedSeconds >= browserCacheTTL.toSeconds()) {
        isExpired = true;
      }
    }

    // 인터넷에서 새로 받아야 하는 상황 (캐시가 없거나, 기간이 만료되었거나)
    if (!localDiskCache.containsKey(url) || isExpired) {
      if (isExpired) {
        System.out.println("  🍂 [브라우저 캐시 만료] 보관 기간이 지나 내 컴퓨터 임시 폴더에서 해당 이미지를 파기합니다.");
      } else {
        System.out.println("  💡 [브라우저 캐시 미스] 내 컴퓨터에 저장된 기록이 없어 인터넷 연결을 시도합니다.");
      }

      // 물리 인터넷 다운로드 실행 후 결과물을 로컬 캐시에 저장
      RemoteNetworkImage downloadedImage = new RemoteNetworkImage(this.url);
      localDiskCache.put(url, downloadedImage);
      cacheTimestamps.put(url, now);
    } else {
      // 인터넷을 쓰지 않고 내 컴퓨터 하드디스크에서 즉시 꺼내옴
      System.out.println("  ✨ [브라우저 캐시 히트] 인터넷 통신을 하지 않고, 내 컴퓨터 C드라이브 임시폴더(Local Cache)에서 즉시 로드합니다! (0.0001초)");
    }

    // 화면 렌더링
    localDiskCache.get(url).render();
    System.out.println();
  }
}

// 4. 내 컴퓨터 가동 시뮬레이션
public class Main {
  public static void main(String[] args) throws InterruptedException {
    
    String naverLogoUrl = "https://www.naver.com/images/logo.png";
    WebBrowserImage logo = new ChromeImageCacheProxy(naverLogoUrl);

    // 시나리오 1: 오전 10:00 네이버 최초 접속 (매우 느림 - 인터넷 다운로드 작동)
    logo.render();

    // 시나리오 2: 오전 10:01 새로고침 F5 누름 (엄청 빠름 - 내 컴퓨터 하드디스크에서 꺼내옴)
    Thread.sleep(1000); // 1초 대기
    System.out.println("[유저 인터랙션] 사용자가 새로고침(F5)을 클릭했습니다.");
    logo.render();

    // 시나리오 3: 4초 뒤 재접속 (캐시 만료로 인해 다시 인터넷에서 다운로드)
    Thread.sleep(3000); // 3초 대기 (총 4초 경과로 만료 정책 동작)
    System.out.println("[유저 인터랙션] 몇 시간 뒤 유저가 다시 해당 페이지에 재방문했습니다.");
    logo.render();
  }
}
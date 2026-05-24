package oop05designpatterns.t01creational.eg01singleton;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * [Thread-Safe LazyHolder Singleton]
 * 중앙 집중식 고성능 로그 관리자 시스템
 * Serializable을 구현하여 직렬화 역직렬화 공격 방어 예시 포함
 */
class CentralLoggingManager implements Serializable {

  private static final long serialVersionUID = 1L;

  // 멀티스레드 동시성 자원 안전성 보장을 위한 자료구조 및 원자적 변수
  private final ConcurrentLinkedQueue<String> logQueue = new ConcurrentLinkedQueue<>();
  private final AtomicInteger logCount = new AtomicInteger(0);

  // 규칙 1: private 생성자로 외부 인스턴스화 원천 차단
  private CentralLoggingManager() {
    // [방어 코드] 리플렉션 기술을 이용해 private 생성자를 강제로 열어 호출하는 변칙 공격 방어
    if (LazyHolder.INSTANCE != null) {
      throw new IllegalStateException("이미 인스턴스가 존재합니다. getInstance()를 사용하세요.");
    }

    System.out.println("[" + LocalDateTime.now() + "] ⚙️ [시스템] 로그 관리자 싱글톤 인스턴스가 최초 메모리에 할당되었습니다.");
  }

  // 규칙 2: 내부 static 클래스 (Holder) 정의
  // 클래스 로더 메커니즘을 이용해, getInstance()가 호출되는 시점에 단 1번 원자적으로 인스턴스가 생성됨
  private static class LazyHolder {
    private static final CentralLoggingManager INSTANCE = new CentralLoggingManager();
  }

  // 규칙 3: 외부에서 인스턴스를 획득할 수 있는 유일한 글로벌 통로
  public static CentralLoggingManager getInstance() {
    return LazyHolder.INSTANCE;
  }

  // [방어 코드] 직렬화된 객체를 역직렬화할 때 새로운 인스턴스가 생성되는 것을 방지
  protected Object readResolve() {
    return getInstance();
  }

  // =============================================================================
  // 비즈니스 로직 (멀티스레드 안전)
  // =============================================================================

  public void writeLog(String threadName, String message) {
    String formattedLog = String.format("[%s] [%s] -> %s", LocalDateTime.now(), threadName, message);
    logQueue.add(formattedLog);
    logCount.incrementAndGet();
    System.out.println("[콘솔 출력] " + formattedLog);
  }

  public void flushAndPrintSummary() {
    System.out.println("\n=================================================");
    System.out.println(" 📊 [로그 시스템 요약 보고서]");
    System.out.println(" - 싱글톤 고유 메모리 주소(HashCode): " + this.hashCode());
    System.out.println(" - 총 수집된 로그 개수: " + logCount.get() + "개");
    System.out.println(" - 현재 큐에 잔류 중인 로그 수: " + logQueue.size() + "개");
    System.out.println("=================================================\n");
  }
}

// =============================================================================
// 클라이언트 동시성 시뮬레이션 테스트 실행 환경
// =============================================================================
public class Main {
  public static void main(String[] args) {
    System.out.println("=== 멀티스레드 싱글톤 안정성 테스트 가동 ===\n");

    int poolSize = 5;
    ExecutorService threadPool = Executors.newFixedThreadPool(poolSize);

    // 5개의 서로 다른 워커 스레드가 동시에 싱글톤 객체를 호출하여 로그를 쌓는 시뮬레이션
    for (int i = 1; i <= poolSize; i++) {
      final int workerId = i;
      threadPool.submit(() -> {
        String threadName = "Worker-Thread-" + workerId;

        // 전역 유일 객체 호출
        CentralLoggingManager logger = CentralLoggingManager.getInstance();

        // 주소값 확인용 로그 출력 (모두 동일해야 정상)
        System.out.println(String.format("[%s]가 참조한 매니저 해시코드: %d", threadName, logger.hashCode()));

        // 로그 데이터 적재 인터랙션
        logger.writeLog(threadName, "트랜잭션 처리를 시작합니다.");
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        logger.writeLog(threadName, "비즈니스 데이터 조회가 완료되었습니다.");
      });
    }

    // 스레드 풀 종료 대기
    threadPool.shutdown();
    try {
      if (!threadPool.awaitTermination(5, TimeUnit.SECONDS)) {
        threadPool.shutdownNow();
      }
    } catch (InterruptedException e) {
      threadPool.shutdownNow();
    }

    // 메인 스레드에서 싱글톤을 호출하여 최종 데이터가 통합 관리되었는지 확인
    CentralLoggingManager finalLogger = CentralLoggingManager.getInstance();
    finalLogger.flushAndPrintSummary();
  }
}
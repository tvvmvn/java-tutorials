package more.thread02;

// Runnable 구현
class RunnableImpl implements Runnable {
  @Override
  public void run() {
    System.out.println("스레드 실행중..");
  }
}

public class Main {
  public static void main(String[] args) {
    // 스레드 생성
    Thread thread = new Thread(new RunnableImpl());

    // 스레드 시작
    thread.start();

    System.out.println("메인 프로그램 실행중..");
  }
}

// 메인 프로그램 실행중..
// 스레드 실행중..
package more.thread01;

// Thread 상속
class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("스레드 실행중..");
  }
}

public class Main {
  public static void main(String[] args) {
    // 스레드 생성
    MyThread thread = new MyThread();

    // 스레드를 시작합니다.
    thread.start();

    System.out.println("메인 프로그램 실행중..");
  }
}

// 메인 프로그램 실행중..
// 스레드 실행중..
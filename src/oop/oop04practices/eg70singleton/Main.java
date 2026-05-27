package oop.oop04practices.eg70singleton;

// 하나의 객체만 생성하도록 보장하는 디자인 패턴.
// 프로그램은 싱글턴을 공유합니다.
// 서버의 빈(Bean)들은 모두 싱글턴입니다.

class MySingleton {

  // 클래스 로딩 시점에 바로 객체 생성 (static final)
  private static final MySingleton mySingleton = new MySingleton();

  // private 생성자로 외부 생성 차단
  private MySingleton() {}

  // 만들어진 인스턴스를 반환
  public static MySingleton getInstance() {
    return mySingleton;
  }
}

public class Main {
  public static void main(String[] args) {
    
    MySingleton singleton1 = MySingleton.getInstance();
    MySingleton singleton2 = MySingleton.getInstance();

    // 객체간에 == 를 사용하면 두 객체가 동일한지 비교합니다.
    // 즉 메모리 상에서 같은 곳을 가리키는지 검사
    System.out.println(singleton1 == singleton2);
  }  
}

// true

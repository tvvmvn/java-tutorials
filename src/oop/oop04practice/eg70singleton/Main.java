package oop.oop04practice.eg70singleton;

// 하나의 객체를 생성해 공유하는 패턴입니다.
// 서버의 빈(Bean)들은 모두 싱글턴입니다.
class MySingleton {

  // static 변수에 싱글턴을 저장합니다.
  private static final MySingleton mySingleton = new MySingleton();

  // private 생성자로 외부 생성을 차단합니다
  private MySingleton() {}

  // 만들어진 싱글턴 인스턴스를 반환합니다
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

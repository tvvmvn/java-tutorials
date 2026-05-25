package oop.oop04practices.eg70singleton;

class MySingleton {

  // 클래스 로딩 시점에 바로 객체 생성 (static 변수)
  private static final MySingleton mySingleton = new MySingleton();

  // private 생성자로 외부 생성 차단
  private MySingleton() {}

  // 만들어진 인스턴스를 반환만 함
  public static MySingleton getInstance() {
    return mySingleton;
  }
}

public class Main {
  public static void main(String[] args) {
    
    MySingleton singleton1 = MySingleton.getInstance();
    MySingleton singleton2 = MySingleton.getInstance();

    System.out.println(singleton1 == singleton2);
  }  
}

// true

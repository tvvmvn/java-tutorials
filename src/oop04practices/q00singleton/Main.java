package oop04practices.q00singleton;

class Singleton {

  // 클래스 로딩 시점에 바로 객체 생성 (static 변수)
  private static final Singleton instance = new Singleton();

  // private 생성자로 외부 생성 차단
  private Singleton() {}

  // 만들어진 인스턴스를 반환만 함
  public static Singleton getInstance() {
    return instance;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton1 == singleton2);
  }  
}

// true

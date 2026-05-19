package more.annotation;

class Person {
  void greeting() {
    System.out.println("hello");
  }
}

class Korean extends Person {
  @Override
  public void unknown() {
    System.out.println("안녕하세요");
  }
}

public class Main {
  public static void main(String[] args) {
  }
}

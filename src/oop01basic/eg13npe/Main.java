package oop01basic.eg13npe;

class Person {
  void greeting() {
    System.out.println("hello");
  }
}

public class Main {
  public static void main(String[] args) {

    Person person = null;

    // 사용하기 전에 객체가 NULL인지 확인합니다.
    if (person != null) {
      person.greeting();
    }
  }
}

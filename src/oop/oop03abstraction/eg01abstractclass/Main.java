package oop.oop03abstraction.eg01abstractclass;

abstract class Animal {
  // 일반 메서드
  void eat() {
    System.out.println("냠냠");
  }

  // 추상 메서드
  abstract void cry();
}

public class Main {
  public static void main(String[] args) {
  }
}

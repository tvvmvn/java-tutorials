package oop03abstraction.eg02abstractextends;

abstract class Animal {

  // 추상 메서드
  abstract void cry();
  
  // 일반 메서드
  void eat() {
    //..
  }
}

class Duck extends Animal {
  // 추상 메서드를 자식 고유의 방법으로 구현합니다
  void cry() { 
    System.out.println("꽥꽥");
  }
}

public class Main {
  public static void main(String[] args) {
  }
}

// 꽥꽥
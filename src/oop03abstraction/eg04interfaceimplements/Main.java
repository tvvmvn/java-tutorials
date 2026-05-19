package oop03abstraction.eg04interfaceimplements;

interface Animal {
  // 추상 메서드
  void cry();
}

class Duck implements Animal {
  // 추상 메서드를 자식 고유의 방법으로 구현합니다
  public void cry() { 
    System.out.println("꽥꽥");
  }
}

public class Main {
  public static void main(String[] args) {

    Duck duck = new Duck();

    duck.cry();
  }
}

// 꽥꽥
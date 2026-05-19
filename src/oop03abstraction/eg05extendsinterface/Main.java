package oop03abstraction.eg05extendsinterface;

// 부모 인터페이스
interface 마우스 {
  void click();
}

// 자식 인터페이스
interface 휠마우스 extends 마우스 {
  // click() 상속받음
  void scroll();
}

public class Main {
  public static void main(String[] args) {
    
  }
}

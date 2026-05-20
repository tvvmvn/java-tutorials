package oop02inheritance.eg03override2;

class Car {
  // ..
  void drive() {
    System.out.println("부릉부릉");
  }
}

class EV extends Car {
  // ..
  void drive() {
    System.out.println("전기로 부릉부릉");
  }
}

class Main {
  public static void main(String[] args) {
    EV ev = new EV();

    ev.drive();
  }
}

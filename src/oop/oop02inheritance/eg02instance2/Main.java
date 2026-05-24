package oop.oop02inheritance.eg02instance2;

// 부모 클래스
class Car {
  String modelName;
  String color;
  int year;

  void drive() {
    System.out.println("부릉부릉");
  }
}

// 자식 클래스
class EV extends Car {
  int batteryCapacity;
}

public class Main {
  public static void main(String[] args) {

    EV ev = new EV();

    ev.modelName = "네오";
    ev.color = "블랙";
    ev.year = 2024;
    ev.batteryCapacity = 1000;

    System.out.println(ev.modelName);
    System.out.println(ev.color);
    System.out.println(ev.year);
    System.out.println(ev.batteryCapacity);

    ev.drive();
  }
}
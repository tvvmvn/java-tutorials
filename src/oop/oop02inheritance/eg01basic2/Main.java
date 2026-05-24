package oop.oop02inheritance.eg01basic2;

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
    
  }
}


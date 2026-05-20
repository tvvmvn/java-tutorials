package oop02inheritance.eg04superconstructor2;

class Car {

  String modelName;
  String color;
  int year;

  Car(String modelName, String color, int year) {
    this.modelName = modelName;
    this.color = color;
    this.year = year;
  }
}

class EV extends Car {

  int batteryCapacity;

  EV(String modelName, String color, int year, int batteryCapacity) {
    // 물려받은 속성을 부모 생성자에게 전달합니다.
    super(modelName, color, year);
    this.batteryCapacity = batteryCapacity;
  }
}

public class Main {
  public static void main(String[] args) {
    
    EV ev = new EV("네오", "실버", 2020, 1000);

    System.out.println(ev.modelName);
    System.out.println(ev.color);
    System.out.println(ev.year);
    System.out.println(ev.batteryCapacity);
  }
}
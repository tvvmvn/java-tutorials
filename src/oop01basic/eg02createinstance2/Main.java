package oop01basic.eg02createinstance2;

class Car {

  String modelName;
  String color;
  int year;

  void drive() {
    System.out.println("부릉");
  }
}

public class Main {
  public static void main(String[] args) {

    Car car = new Car();
    car.modelName = "아반떼";
    car.color = "화이트";
    car.year = 2020;

    System.out.println(car.modelName);
    System.out.println(car.color);
    System.out.println(car.year);

    //
    car.drive();
  }
}

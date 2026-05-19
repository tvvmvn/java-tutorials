package oop01basic.eg02createinstance2;

class Car {

  String name;
  int age;

  void drive() {
    System.out.println("");
  }
}

public class Main {
  public static void main(String[] args) {

    //
    Car car = new Car();
    car.name = "John";
    car.age = 30;

    //
    System.out.println(car.name);
    System.out.println(car.age);

    //
    car.drive();
  }
}

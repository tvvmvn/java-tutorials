package oop01basic.eg03constructor2;

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

public class Main {
  public static void main(String[] args) {

    Car car = new Car("아반떼", "화이트", 2020);

    System.out.println(car.modelName);
    System.out.println(car.color);
    System.out.println(car.year);
  }
}

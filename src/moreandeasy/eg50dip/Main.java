package moreandeasy.eg50dip;

interface Car {
  void drive();
}

class GasolineCar implements Car {
  public void drive() {}
}

class EV implements Car {
  public void drive() {}
}

class Person {
  String name;
  Car car; //DIP

  Person(String name, Car car) {
    this.name = name;
    this.car = car;
  }
}

public class Main {
  public static void main(String[] args) {

    GasolineCar avante = new GasolineCar();
    Person john = new Person("John Doe", avante);

    EV ev9 = new EV();
    Person jane = new Person("Jane Doe", ev9);
  }
}

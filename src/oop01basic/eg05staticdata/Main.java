package oop01basic.eg05staticdata;

class Person {

  String name;

  // 생성된 
  static int population = 0;

  Person(String name) {
    this.name = name;
    population++;
  }
}

public class Main {
  public static void main(String[] args) {

    Person john = new Person("John Doe");
    Person jane = new Person("Jane Doe");
    Person mary = new Person("Mary Doe");

    System.out.println(Person.population);
  }
}

// 3
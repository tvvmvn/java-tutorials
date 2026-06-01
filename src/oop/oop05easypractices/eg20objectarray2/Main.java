package oop.oop05easypractices.eg20objectarray2;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Person{name=%s, age=%d}", name, age);
  }
}

public class Main {
  public static void main(String[] args) {

    Person[] persons = {
      new Person("John Doe", 30),
      new Person("Jane Doe", 25),
      new Person("Mary Doe", 40),
    };

    for (Person person : persons) {
      System.out.println(person);
    }
  }
}

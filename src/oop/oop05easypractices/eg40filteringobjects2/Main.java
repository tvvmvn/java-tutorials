package oop.oop05easypractices.eg40filteringobjects2;

class Person {
  String name;
  String address;

  Person(String name, String address) {
    this.name = name;
    this.address = address;
  }
}

public class Main {
  public static void main(String[] args) {

    Person[] persons = {
      new Person("John Doe", "New York"),
      new Person("Jane Doe", "New York"),
      new Person("Mary Doe", "New York"),
      new Person("짱구", "오사카"),
    };

    for (Person person : persons) {
      if ("오사카".equals(person.address)) {
        System.out.println(person.name);
      }
    }
  }
}

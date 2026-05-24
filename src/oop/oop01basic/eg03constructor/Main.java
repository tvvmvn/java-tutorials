package oop.oop01basic.eg03constructor;

class Person {

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Main {
  public static void main(String[] args) {

    Person person = new Person("John Doe", 30);

    System.out.println(person.name);
    System.out.println(person.age);
  }
}

// John Doe
// 30
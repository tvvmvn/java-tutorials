package dive.d80stream.eg03withstream;

import java.util.Arrays;

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

    Person[] persons = {
      new Person("John Doe", 30),
      new Person("Jane Doe", 25),
      new Person("Mary Doe", 40),
      new Person("짱구", 5)
    };
    
    // 선언형 언어
    Arrays.stream(persons)
      .filter(person -> person.age >= 18)
      .forEach((person) -> System.out.println(person.name));
  }
}

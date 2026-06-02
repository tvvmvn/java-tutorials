package dive.d80stream.eg01create;

import java.util.Arrays;
import java.util.stream.Stream;

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

    // 배열
    Person[] persons = {
      new Person("John Doe", 30),
      new Person("Jane Doe", 25),
      new Person("Mary Doe", 40),
      new Person("짱구", 5)
    };
    
    Stream <Person> personsStream = Arrays.stream(persons);

    System.out.println(personsStream);
  }
}

// java.util.stream.ReferencePipeline$Head@7344699f
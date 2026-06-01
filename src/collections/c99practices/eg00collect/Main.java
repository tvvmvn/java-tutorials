package collections.c99practices.eg00collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    
    List<Person> persons = new ArrayList<>();
    
    persons.add(new Person("John Doe", 30));
    persons.add(new Person("Jane Doe", 25));
    persons.add(new Person("Mary Doe", 40));
    persons.add(new Person("짱구", 5));
    
    List<Person> adults = persons.stream()  
      .filter(person -> person.age >= 18)
      .collect(Collectors.toList());

    System.out.println(adults);
  }
}

package dive2practices.q00optional;

import java.util.Optional;

class Person {
  
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Person[name=%s, age=%d]}", name, age);
  }
}

class PersonRepository {

  Optional<Person> findByName(String name) {

    Person[] persons = new Person[4];

    persons[0] = new Person("John Doe", 30);
    persons[1] = new Person("Jane Doe", 25);
    persons[2] = new Person("Mary Doe", 40);
    persons[3] = new Person("Steve Jobs", 55);

    for (Person person : persons) {
      if (person.name.equals(name)) {
        return Optional.of(person);
      }
    }
    
    return Optional.empty();
  }
}

public class Main {

  public static void main(String[] args) {

    PersonRepository personRepository = new PersonRepository();

    try {
      Person person = personRepository
        .findByName("Tom Cruise")
        .orElseThrow(() -> new IllegalArgumentException("No such person"));

      System.out.println(person.toString());
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }

  }
}

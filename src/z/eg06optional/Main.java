package z.eg06optional;

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
    
    // 왜 예외가 발생했는지 로그로 확인 가능.
    Person person = personRepository
      .findByName("Tom Cruise")
      .orElseThrow(() -> new IllegalArgumentException("그런 이름의 사람은 없어요"));

    System.out.println(person.toString());
  }
}

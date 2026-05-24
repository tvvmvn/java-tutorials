package dive01basic.d90optional.eg05optional;

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
  //
  Person findByName(String name) {
    Person[] persons = new Person[4];

    persons[0] = new Person("John Doe", 30);
    persons[1] = new Person("Jane Doe", 25);
    persons[2] = new Person("Mary Doe", 40);
    persons[3] = new Person("Steve Jobs", 55);

    for (Person person : persons) {
      if (person.name.equals(name)) {
        return person;
      }
    }
    
    return null;
  }
}

public class Main {

  public static void main(String[] args) {

    PersonRepository personRepository = new PersonRepository();
    
    // NPE만 보고 어떤 에러가 발생했는지 알기 어려움.
    // 어떤게 null일까? personRepository? person?
    Person person = personRepository.findByName("Tom Cruise");

    System.out.println(person.toString());
  }
}


package moreandeasy.eg30iterateinstances;

import java.util.ArrayList;
import java.util.List;

class Person {

  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  
  @Override
  public String toString() {
    return String.format("Person{firstName=%s, lastName=%s, age=%d}", firstName, lastName, age);
  }
}

public class Main {
  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John", "Doe", 30));
    persons.add(new Person("Jane", "Doe", 25));
    persons.add(new Person("Mary", "Doe", 40));

    System.out.println("일반 for문으로 출력:");
    for (int i = 0; i < persons.size(); i++) {
      System.out.println(persons.get(i));
    }

    System.out.println("향상된 for문으로 출력:");
    for (Person person : persons) {
      System.out.println(person);
    }
  }
}

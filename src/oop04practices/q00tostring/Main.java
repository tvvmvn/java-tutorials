package oop04practices.q00tostring;

class Person {
  String name;
  String email;
  int age;

  Person(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Person[name=%s, email=%s, age=%d]", name, email, age);
  }
}

public class Main {
  public static void main(String[] args) {
    Person person = new Person("John Doe", "johndoe@example.com", 30)  ;

    System.out.println(person.toString());
  }
}

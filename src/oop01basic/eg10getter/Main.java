package oop01basic.eg10getter;

// Person => Person2
class Person {

  String name;

  Person(String name) {
    this.name = name;
  }
}

class Person2 {

  String firstName;
  String lastName;

  Person2(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}


public class Main {
  public static void main(String[] args) {
    
    Person person = new Person("John Doe");

    // need to change
    System.out.println(person.name);
  }
}

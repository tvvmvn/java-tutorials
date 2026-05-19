package oop01basic.eg10getter2;

// 이전
class Person {
  
  String name;

  Person(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }
}

// 현재
class Person2 {

  String firstName;
  String lastName;

  Person2(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  String getName() {
    return firstName + " " + lastName;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person("John Doe");

    // no need to change!
    System.out.println(person.getName());
  }
}

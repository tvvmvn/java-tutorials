package oop.oop05easypractices.eg01tostring;

class Person {

  String firstName;
  String lastName;
  int age;

  Person(String firstName, String lastName, int age) {
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

    Person john = new Person("John", "Doe", 30);
    System.out.println(john);
    
    Person jane = new Person("Jane", "Doe", 25);
    System.out.println(jane);
    
    Person mary = new Person("Mary", "Doe", 40);
    System.out.println(mary);
  }
}

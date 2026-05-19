package oop01basic.eg11nosetter;

class Person {
  String name;
  int age;
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person();

    person.name = "j";

    System.out.println(person.name);
  }
}

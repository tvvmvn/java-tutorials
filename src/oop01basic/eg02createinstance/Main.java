package oop01basic.eg02createinstance;

class Person {
  
  String name;
  int age;

  void greeting() {
    System.out.println("hello");
  }
}

public class Main {
  public static void main(String[] args) {

    Person person = new Person();
    person.name = "John";
    person.age = 30;


    System.out.println(person.name);
    System.out.println(person.age);
    person.greeting();
  }
}

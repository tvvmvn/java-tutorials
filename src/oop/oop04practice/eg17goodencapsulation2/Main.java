package oop.oop04practice.eg17goodencapsulation2;

class Person {

  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  boolean isAdult() {
    return age >= 18;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person("짱구", 5);

    if (!person.isAdult()) {
      System.out.println("어린이는 입장 불가!");
      return;
    } 

    System.out.println("잘 오셨습니다");
  }
}
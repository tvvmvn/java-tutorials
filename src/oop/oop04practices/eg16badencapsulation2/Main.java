package oop.oop04practices.eg16badencapsulation2;

class Person {

  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person("짱구", 5);

    if (person.getAge() < 18) {
      System.out.println("어린이는 입장 불가!");
      return;
    } 

    System.out.println("잘 오셨습니다");
  }
}
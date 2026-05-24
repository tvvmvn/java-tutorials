package oop.oop01basic.eg04overloadingconstructor;

class Person {
  
  String name;
  int age;
  // 생성자 오버로딩 - 의도가 중요하다
  Person(String name) {
    // 내부적으로 두번째 생성자를 활용합니다. 
    this(name, 0);
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Main {
  public static void main(String[] args) {

    Person john = new Person("John Doe", 30);
    Person jane = new Person("Jane Doe");

    System.out.println(john.age);
    System.out.println(jane.age);
  }
}

// 30
// 0
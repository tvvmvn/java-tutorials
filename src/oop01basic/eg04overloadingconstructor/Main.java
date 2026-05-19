package oop01basic.eg04overloadingconstructor;

class Person {
  
  String name;
  int age;

  // 나이 정보가 없거나 보호하고 싶은 경우 사용할 수 있는 생성자
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
    // 두번째 생성자 사용
    Person john = new Person("John Doe", 30);

    // 첫번째 생성자 사용
    Person jane = new Person("Jane Doe");

    System.out.println(john.age);
    System.out.println(jane.age);
  }
}

// 30
// 0
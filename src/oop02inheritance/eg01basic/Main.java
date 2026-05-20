package oop02inheritance.eg01basic;

// 부모 클래스
class Person {
  String name;
  int age;

  void greeting() {
    System.out.println("hello");
  }
}

// 자식 클래스
class Student extends Person {
  int grade;
}

public class Main {
  public static void main(String[] args) {
    
  }
}

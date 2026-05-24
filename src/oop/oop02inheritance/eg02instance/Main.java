package oop.oop02inheritance.eg02instance;

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
    
    Student student = new Student();
    
    student.name = "John";
    student.age = 20;
    student.grade = 3;

    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println(student.grade);

    student.greeting();
  }
}
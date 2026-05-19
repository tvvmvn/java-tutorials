package oop02inheritance.eg04superconstructor;

class Person {

  String name;
  int age;

  // 부모의 생성자
  Person() {}
}

class Student extends Person {
  
  // name
  // age
  int grade;

  // 자식의 생성자
  Student() {
    super();
  }
}

public class Main {
  public static void main(String[] args) {
    Student student = new Student();

    student.name = "John Doe";
    student.age = 20;
    student.grade = 2;

    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println(student.grade);
  }
}

// John
// 20
// 4
package oop02inheritance.eg04superconstructor;

class Person {

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Student extends Person {

  int grade;

  Student(String name, int age, int grade) {
    // 물려받은 속성을 부모 생성자에게 전달합니다.
    super(name, age);
    this.grade = grade;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Student student = new Student("John Doe", 20, 4);

    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println(student.grade);
  }
}

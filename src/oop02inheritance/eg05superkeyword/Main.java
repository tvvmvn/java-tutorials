package oop02inheritance.eg05superkeyword;

class Person {
  
  void greeting() {
    System.out.println("안녕하세요");
  }
}

class Student extends Person {

  void greeting() {
    // 부모의 greeting 메서드를 활용합니다
    super.greeting();
    System.out.println("저는 학생입니다");
  }
}

public class Main {
  public static void main(String[] args) {
    Student student = new Student();

    student.greeting();
  }
}

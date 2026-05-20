package oop02inheritance.eg03override;

class Person {
  // ..
  void greeting() {
    System.out.println("안녕하세요");
  }
}

class Student extends Person {
  // ..
  void greeting() {
    System.out.println("안녕하세요 저는 학생입니다");
  }
}

class Main {
  public static void main(String[] args) {
    Student student = new Student();

    student.greeting();
  }
}

// hello I'm student
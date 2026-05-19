package oop02inheritance.eg03override;

class Person {
  void greeting() {
    System.out.println("hello");
  }
}

class Student extends Person {
  void greeting() {
    System.out.println("hello I'm student");
  }
}

class Main {
  public static void main(String[] args) {
    Student student = new Student();

    student.greeting();
  }
}

// hello I'm student
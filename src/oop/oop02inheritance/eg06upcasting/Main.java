package oop.oop02inheritance.eg06upcasting;

class Person {
  void greeting() {
    System.out.println("안녕하세요");
  }
}

class Student extends Person {
  void greeting() {
    System.out.println("안녕하세요 저는 학생입니다");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Student();

    person.greeting();
  }
}

// 안녕하세요 저는 학생입니다
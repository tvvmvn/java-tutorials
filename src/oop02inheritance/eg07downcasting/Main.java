package oop02inheritance.eg07downcasting;

// 부모 클래스
class Person {
  void greeting() {
    System.out.println("hello");
  }
}

// 자식 클래스
class Student extends Person {
  // 자식의 독자적인 메서드
  void study() {
    System.out.println("Studying..");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 부모 타입으로 자식 객체를 생성합니다(업캐스팅)
    Person person = new Student();
    
    // 부모는 자식의 독자적인 메서드를 호출할 수 없습니다.
    // person.study(); // error

    // person을 다운캐스팅해서 student 객체를 생성합니다.
    if (person instanceof Student) {
      Student student = (Student) person;
      student.study(); 
    }
  }
}

// Studying..
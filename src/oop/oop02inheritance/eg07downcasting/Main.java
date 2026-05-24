package oop.oop02inheritance.eg07downcasting;

// 부모 클래스
class Person {

  String name;

  void greeting() {
    System.out.println("안녕하세요");
  }
}

// 자식 클래스
class Student extends Person {
  void goSchool() {
    System.out.println("학교가는중");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 업캐스팅
    Person person = new Student();
    person.name = "John Doe";
    
    // person.goSchool(); // error

    // person을 다운캐스팅해서 student 객체를 생성합니다.
    if (person instanceof Student) {
      Student student = (Student) person;
      student.goSchool(); 
    }
  }
}
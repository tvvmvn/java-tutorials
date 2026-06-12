package oop.oop04practice.eg50nobuilder;

class Person {

  private String name;
  private String email;
  private String address;
  private int age;

  // 너무 많은 생성자들
  Person(String name, String email, String address, int age) {
    this.name = name;
    this.email = email;
    this.address = address;
    this.age = age;
  }

  Person(String name, String email, String address) {
    this(name, email, address, 0);
  }

  Person(String name, String email) {
    this(name, email, "", 0);
  }

  // 오버로딩까지 추가하면 객체 생성과 관련된 코드가 너무 많아져요
  // 따라서 객체 생성 로직들을 한 곳에 모으고 
  // 나머지 영역에서는 비즈니스에만 집중하고 싶습니다.

  // 여기 부분이 비즈니스 로직들.
  public void eat() {
    System.out.println("밥 먹는중");
  }

  public void work() {
    System.out.println("일 하는중");
  }

  public void sleep() {
    System.out.println("잠자는 중");
  }

  @Override
  public String toString() {
    return String.format("Person{name=%s, email=%s, address=%s, age=%d}", name, email, address, age);
  }
}

public class Main {
  public static void main(String[] args) {

    // Full info
    Person john = new Person("John Doe", "johndoe@example.com", "xxx", 30);
    System.out.println(john);

    // 나이 비공개
    Person jane = new Person("Jane Doe", "janedoe@example.com", "xxx");
    System.out.println(jane);

    // 나이, 주소 비공개
    Person mary = new Person("Mary Doe", "marydoe@example.com");
    System.out.println(mary);
  }
}
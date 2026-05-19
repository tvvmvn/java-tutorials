package oop01basic.eg12encapsulation;

class Person {
  
  // private!
  private String name;

  Person(String name) {
    setName(name);
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    if (name.length() < 3) {
      throw new IllegalArgumentException("유효한 이름을 입력하세요.");
    }
    this.name = name;
  }
}

public class Main {
  public static void main(String[] args) {
  
    Person person = new Person("j");

    System.out.println(person.getName());
  }
}

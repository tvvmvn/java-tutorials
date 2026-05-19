package oop01basic.eg11setter;

class Person {

  String name;

  void setName(String name) {
    if (name.length() < 3) {
      System.out.println("유효한 이름을 입력하세요.");
      return;
    }
    this.name = name;
  }
}


public class Main {
  public static void main(String[] args) {
    
    Person person = new Person();

    person.setName("x");
  }
}

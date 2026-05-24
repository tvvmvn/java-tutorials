package oop.oop01basic.eg11withsetter;

class Person {

  private String name;

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

    // person.name = "j";

    person.setName("John Doe");
  }
}

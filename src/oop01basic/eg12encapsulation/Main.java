package oop01basic.eg12encapsulation;

class Person {
  
  // private
  private String name;

  String getName() {
    return name;
  }

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
    
    person.setName("John Doe");

    System.out.println(person.getName());
  }
}

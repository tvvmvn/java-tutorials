package oop01basic.eg12encapsulation2;

class Person {
  
  // private!
  private int age;

  int getAge() {
    return age;
  }

  void setAge(int age) {
    if (age < 0) {
      System.out.println("나이가 음수가 되겠냐");
      return;
    }
    this.age = age;
  }
}

public class Main {
  public static void main(String[] args) {
  
    Person person = new Person();

    person.setAge(30);

    System.out.println(person.getAge());
  }
}

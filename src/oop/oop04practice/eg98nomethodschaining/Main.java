package oop.oop04practice.eg98nomethodschaining;

class Person {

  String name;

  Person(String name) {
    this.name = name;
  }

  void greeting() {
    System.out.println("안녕 난 " + name + "라고 해.");
  }
  
  void wakeUp() {
    System.out.println("좋은 아침!");
  }

  void haveBreakfast() {
    System.out.println("아침 먹는 중");
  }

  void work() {
    System.out.println("일하는 중");
  }

  void sleep() {
    System.out.println("잠 자는중");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person john = new Person("John Doe");
    
    john.greeting();
    john.wakeUp();
    john.haveBreakfast();
    john.work();
    john.sleep();
  }
}

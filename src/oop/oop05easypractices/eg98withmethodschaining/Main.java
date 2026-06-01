package oop.oop05easypractices.eg98withmethodschaining;

class Person {

  String name;

  Person(String name) {
    this.name = name;
  }

  Person greeting() {
    System.out.println("안녕 난 " + name + "라고 해.");
    return this;
  }
  
  Person wakeUp() {
    System.out.println("좋은 아침!");
    return this;
  }

  Person haveBreakfast() {
    System.out.println("아침 먹는 중");
    return this;
  }

  Person work() {
    System.out.println("일하는 중");
    return this;
  }

  Person sleep() {
    System.out.println("잠 자는중");
    return this;
  }
}

public class Main {
  public static void main(String[] args) {
    
    new Person("John Doe")
      .greeting()
      .wakeUp()
      .haveBreakfast()
      .work()
      .sleep();
  }
}

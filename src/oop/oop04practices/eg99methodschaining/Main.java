package oop.oop04practices.eg99methodschaining;

class Person {
  
  Person wakeUp() {
    System.out.println("Wake Up");
    return this;
  }

  Person haveBreakfast() {
    System.out.println("Have breakfast");
    return this;
  }

  Person goWork() {
    System.out.println("Going work");
    return this;
  }

  Person sleep() {
    System.out.println("Sleeping..");
    return this;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person();

    person.wakeUp()
      .haveBreakfast()
      .goWork()
      .sleep();
  }
}

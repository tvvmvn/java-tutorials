package oop03abstraction.eg04interfaceimplements;

interface Animal {
  void cry();
}

class Dog implements Animal {
  public void cry() { 
    System.out.println("멍멍");
  }
}

class Cat implements Animal {
  public void cry() {
    System.out.println("야옹");
  }
}

class Duck implements Animal {
  public void cry() {
    System.out.println("꽥꽥");
  }
}

public class Main {
  public static void main(String[] args) {

    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal duck = new Duck();

    dog.cry();
    cat.cry();
    duck.cry();
  }
}
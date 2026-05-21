package oop03abstraction.eg02abstractextends;

abstract class Animal {
  abstract void cry();
}

class Dog extends Animal {
  void cry() { 
    System.out.println("멍멍");
  }
}

class Cat extends Animal {
  void cry() {
    System.out.println("야옹");
  }
}

class Duck extends Animal {
  void cry() {
    System.out.println("꽥꽥");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.cry();

    Animal cat = new Cat();
    cat.cry();

    Animal duck = new Duck();
    duck.cry();
  }
}

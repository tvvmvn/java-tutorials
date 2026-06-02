package dive.d70generics.eg04limits;

interface Animal {
  void cry();
}

class Dog implements Animal {
  @Override
  public void cry() {
    System.out.println("멍멍");
  }
}

class Cat implements Animal {
  @Override
  public void cry() {
    System.out.println("야옹");
  }
}

class Duck implements Animal {
  @Override
  public void cry() {
    System.out.println("꽥꽥");
  }
}

class AnimalFarm<T extends Animal> {
  T animal;

  AnimalFarm(T animal) {
    this.animal = animal;
    animal.cry();
  }
}

public class Main {
  public static void main(String[] args) {
    AnimalFarm<Dog> dogFarm = new AnimalFarm<>(new Dog());
    AnimalFarm<Cat> catFarm = new AnimalFarm<>(new Cat());
    AnimalFarm<Duck> duckFarm = new AnimalFarm<>(new Duck());
  }
}

package oop.oop04practices.eg10dependencyinjection;

class Pet {

  String type;
  String name;

  Pet(String name, String type) {
    this.type = type;
    this.name = name;
  }

  void roll() {
    System.out.println("구르는 중!");
  }
}

class Person {

  String name;
  Pet pet;

  Person(String name, Pet pet) {
    this.name = name;
    this.pet = pet;
  }

  void play() {
    System.out.println("굴러 " + pet.name + "!");
    pet.roll();
  }
}

public class Main {
  public static void main(String[] args) {
    
    Pet pet = new Pet("Pongo", "Dog");
    Person person = new Person("John Doe", pet);
    person.play();
  }
}

// 굴러 Pongo!
// 구르는 중!
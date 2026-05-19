package oop04practices.q00association;

class Pet {
  String name;

  Pet(String name) {
    this.name = name;
  }
}

class Person {
  String name;
  // Pet은 Person에 포함됩니다
  Pet pet;

  Person(String name, Pet pet) {
    this.name = name;
    this.pet = pet;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Pet pet = new Pet("Pongo");
    Person person = new Person("John", pet);

    System.out.println(person.pet.name);
  }
}

// Pongo
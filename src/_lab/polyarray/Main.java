package _lab.polyarray;

interface Animal {
  void sound();
}

class Dog implements Animal {
  public void sound() {
    System.out.println("bow wow");
  }
}

class Cat implements Animal {
  public void sound() {
    System.out.println("Meow");
  }
}

class Bird implements Animal {
  public void sound() {
    System.out.println("po po");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    Animal[] animals = new Animal[3];

    animals[0] = new Dog();
    animals[1] = new Cat();
    animals[2] = new Bird();

    for (Animal animal : animals) {
      animal.sound();
    }
  }
}

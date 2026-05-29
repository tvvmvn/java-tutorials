package oop.oop04practices.eg99nomethodschaining2;

class Ramen {

  String name;

  Ramen(String name) {
    this.name = name;
  }

  void boilWater() {
    System.out.println("물 끓이는 중");
  }

  void addIngredients() {
    System.out.println("건더기 넣는 중");
  }

  void addSpice() {
    System.out.println("스프 넣는 중");
  }

  void addNoodles() {
    System.out.println("면 익히는 중");
  }
}

public class Main {
  public static void main(String[] args) {

    Ramen ramen = new Ramen("신라면");

    ramen.boilWater();
    ramen.addIngredients();
    ramen.addSpice();
    ramen.addNoodles();
  }
}

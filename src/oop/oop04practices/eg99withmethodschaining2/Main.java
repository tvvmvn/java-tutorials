package oop.oop04practices.eg99withmethodschaining2;

class Ramen {

  String name;

  Ramen(String name) {
    this.name = name;
  }

  Ramen boilWater() {
    System.out.println("물 끓이는 중");
    return this;
  }

  Ramen addIngredients() {
    System.out.println("건더기 넣는 중");
    return this;
  }

  Ramen addSpice() {
    System.out.println("스프 넣는 중");
    return this;
  }

  Ramen addNoodles() {
    System.out.println("면 익히는 중");
    return this;
  }
}

public class Main {
  public static void main(String[] args) {
    
    new Ramen("신라면")
      .boilWater()
      .addIngredients()
      .addSpice()
      .addNoodles();
  }
}

package oop.oop05easypractices.eg99withmethodschaining2;

class Chef {

  String bowl = "";

  Chef boilWater() {
    bowl += "물 ";
    return this;
  }

  Chef addIngredients() {
    bowl += "건더기 ";
    return this;
  }

  Chef addSpice() {
    bowl += "스프 ";
    return this;
  }

  Chef cookNoodles() {
    bowl += "면 ";
    return this;
  }

  String serve() {
    return bowl;
  }
}

public class Main {
  public static void main(String[] args) {
    
    String ramen = new Chef()
      .boilWater()
      .addIngredients()
      .addSpice()
      .cookNoodles()
      .serve();

    System.out.println(ramen);
  }
}

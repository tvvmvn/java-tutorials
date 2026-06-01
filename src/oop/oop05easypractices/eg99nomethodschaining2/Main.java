package oop.oop05easypractices.eg99nomethodschaining2;

class Chef {

  String bowl = "";

  void boilWater() {
    bowl += "물 ";
  }

  void addIngredients() {
    bowl += "건더기 ";
  }

  void addSpice() {
    bowl += "스프 ";
  }

  void cookNoodles() {
    bowl += "면 ";
  }

  String serve() {
    return bowl;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Chef chef = new Chef();

    // 요리중
    chef.boilWater();
    chef.addIngredients();
    chef.addSpice();
    chef.cookNoodles();

    System.out.println(chef.serve());
  }
}

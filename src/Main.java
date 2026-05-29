class Chef {

  String bowl = "";

  Chef boilWater() {
    bowl += "water ";
    return this;
  }

  Chef addIngredients() {
    bowl += "ingredients ";
    return this;
  }

  Chef addSpice() {
    bowl += "spice ";
    return this;
  }

  Chef addNoodle() {
    bowl += "noodles ";
    return this;
  }

  String getRamen() {
    return bowl;
  }
}

public class Main {
  public static void main(String[] args) {
    
    String ramen = new Chef()
      .boilWater()
      .addIngredients()
      .addSpice()
      .addNoodle()
      .getRamen();

    System.out.println(ramen);
  }
}
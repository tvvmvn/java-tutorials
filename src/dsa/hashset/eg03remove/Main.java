package dsa.hashset.eg03remove;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    HashSet<String> cars = new HashSet<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.remove("Volvo");

    System.out.println(cars);
  }
}

//true
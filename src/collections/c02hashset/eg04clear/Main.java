package collections.c02hashset.eg04clear;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    HashSet<String> cars = new HashSet<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.clear();

    System.out.println(cars);
  }
}

//true
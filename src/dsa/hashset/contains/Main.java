package dsa.hashset.contains;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    HashSet<String> cars = new HashSet<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    System.out.println(cars.contains("Volvo"));
  }
}

//true
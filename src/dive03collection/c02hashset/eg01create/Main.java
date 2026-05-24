package dive03collection.c02hashset.eg01create;

import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    Set<String> cars = new HashSet<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    System.out.println(cars);
  }
}
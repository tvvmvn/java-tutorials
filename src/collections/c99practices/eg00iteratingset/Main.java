package collections.c99practices.eg00iteratingset;

import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    Set<String> cars = new HashSet<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    // map(), filter()는 없음!
    cars.forEach(car -> System.out.println(car));
  }
}
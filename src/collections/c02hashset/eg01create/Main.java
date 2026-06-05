package collections.c02hashset.eg01create;

import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    Set<String> fruits = new HashSet<String>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    System.out.println(fruits);
  }
}
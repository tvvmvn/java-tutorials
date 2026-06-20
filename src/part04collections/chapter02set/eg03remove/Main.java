package part04collections.chapter02set.eg03remove;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Set<String> fruits = new HashSet<String>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    System.out.println(fruits);

    fruits.remove("Orange");

    System.out.println(fruits);
  }
}

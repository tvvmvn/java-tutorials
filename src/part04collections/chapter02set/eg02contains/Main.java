package part04collections.chapter02set.eg02contains;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Set<String> fruits = new HashSet<String>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    System.out.println(fruits.contains("Apple"));
    System.out.println(fruits.contains("Mango"));
  }
}

//true
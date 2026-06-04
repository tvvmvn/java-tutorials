package collections.c02hashset.eg01create;

import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    Set<String> persons = new HashSet<String>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    System.out.println(persons);
  }
}
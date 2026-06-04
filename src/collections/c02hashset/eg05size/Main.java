package collections.c02hashset.eg05size;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Set<String> persons = new HashSet<String>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    System.out.println(persons.size());
  }
}
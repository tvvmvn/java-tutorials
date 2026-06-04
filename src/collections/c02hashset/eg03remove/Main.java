package collections.c02hashset.eg03remove;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Set<String> persons = new HashSet<String>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    System.out.println(persons);

    persons.remove("John Doe");

    System.out.println(persons.contains("John Doe"));
  }
}

package collections.c01arraylist.eg05size;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> persons = new ArrayList<String>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    System.out.println(persons.size());
  }
}


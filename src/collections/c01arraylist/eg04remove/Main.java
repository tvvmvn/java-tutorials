package collections.c01arraylist.eg04remove;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> persons = new ArrayList<String>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    System.out.println(persons);

    persons.remove(0);//John Doe

    System.out.println(persons);
  }
}

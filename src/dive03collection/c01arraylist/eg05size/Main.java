package dive03collection.c01arraylist.eg05size;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars.size());
  }
}


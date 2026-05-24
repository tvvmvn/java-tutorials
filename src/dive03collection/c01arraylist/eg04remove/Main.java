package dive03collection.c01arraylist.eg04remove;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // remove
    cars.remove(0);

    System.out.println(cars);
  }
}

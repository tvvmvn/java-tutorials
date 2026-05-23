package dsa.arraylist.eg03change;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // change
    cars.set(0, "Opel");

    System.out.println(cars);
  }
}

package collections.c99practices.eg00iteratinglist;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    cars.forEach(car -> System.out.println(car));
  }
}

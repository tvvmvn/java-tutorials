package collections.c10collections.eg01sorting;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class


public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Sort cars
    Collections.sort(cars);  

    System.out.println(cars);
  }
}
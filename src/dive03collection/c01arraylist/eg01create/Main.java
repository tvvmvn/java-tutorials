package dive03collection.c01arraylist.eg01create;

// Import the ArrayList class
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    System.out.println(cars);
  }
}

// [Volvo, BMW, Ford, Mazda]
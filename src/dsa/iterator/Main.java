package dsa.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    Iterator<String> iterator = cars.iterator();

    System.out.println(iterator.next());
    System.out.println(iterator.next());
    System.out.println(iterator.next());
  }
}

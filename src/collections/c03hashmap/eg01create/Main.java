package collections.c03hashmap.eg01create;

// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("S.Korea", "Seoul");
    capitalCities.put("Japan", "Tokyo");
    capitalCities.put("USA", "Washington D.C");
    capitalCities.put("Germany", "Berlin");

    System.out.println(capitalCities);
  }
}

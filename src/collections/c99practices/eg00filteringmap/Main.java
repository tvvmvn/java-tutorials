package collections.c99practices.eg00filteringmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    
    Map<String, String> capitalCities = new HashMap<>();

    capitalCities.put("S.Korea", "Seoul");
    capitalCities.put("Japan", "Tokyo");
    capitalCities.put("USA", "Washington D.C");

    //
    System.out.println("The capital city in each country:");
    capitalCities.forEach((key, value) -> {
      System.out.printf("%s: %s\n", key, value);
    });
  }
}

package part04collections.chapter99practice.eg45responsemap;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    
    // No DTO
    Map<String, String> response = new HashMap<>();
    response.put("accessToken", "xxx");

    System.out.println(response);// JSON (text)
  }
}

package dive.d80stream.eg04map2;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    String[] data = {"foo", "bar", "baz"};
    
    // No stream
    for (String item : data) {
      System.out.println(item.toUpperCase());
    }
    
    // Stream
    Arrays.stream(data)
      .map(item -> item.toUpperCase())
      .forEach(item -> System.out.println(item));
  }
}
package dive.d80stream.eg01create2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    // 배열
    String[] fruits = {"참외", "수박", "망고", "용과"};
    
    Stream <String> fruitsStream = Arrays.stream(fruits);

    System.out.println(fruitsStream);
  }
}

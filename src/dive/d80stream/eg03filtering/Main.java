package dive.d80stream.eg03filtering;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    
    int[] ages = {12, 18, 22, 30};

    // No Stream
    // for (int age : ages) {
    //   if (age >= 18) {
    //     System.out.println(age);
    //   }
    // }

    // Stream
    Arrays.stream(ages)
      .filter(age -> age >= 18)
      .forEach(age -> System.out.println(age));
  }
}

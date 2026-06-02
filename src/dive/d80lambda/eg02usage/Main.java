package dive.d80lambda.eg02usage;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    
    String[] persons = {"John Doe", "Jane Doe", "Mary Doe"};

    Arrays.stream(persons)
      .forEach((person) -> System.out.println(person));
  }
}

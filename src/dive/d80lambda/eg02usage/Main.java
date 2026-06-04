package dive.d80lambda.eg02usage;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    
    String[] persons = {"John Doe", "Jane Doe", "Mary Doe"};

    Consumer<String> consumer = person -> System.out.println(person);

    Arrays.stream(persons)
      .forEach(consumer);
  }
}

package dive.d80stream.eg01createstringstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    String[] persons = {"John Doe", "Jane Doe", "Mary Doe"};
    
    Stream <String> personsStream = Arrays.stream(persons);

    System.out.println(personsStream);
  }
}

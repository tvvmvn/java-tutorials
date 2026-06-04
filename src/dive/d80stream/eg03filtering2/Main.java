package dive.d80stream.eg03filtering2;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    String[] persons = {"John Doe", "Jane Doe", "Mary Doe", "Steve Jobs"};

    // No Stream
    // for (String person : persons) {
    //   if (person.indexOf("J") > -1) {
    //     System.out.println(person);
    //   }
    // }
    
    // Stream
    Arrays.stream(persons)
      .filter(person -> person.indexOf("J") > -1)
      .forEach(person -> System.out.println(person));
  }
}

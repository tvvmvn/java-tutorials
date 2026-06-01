package collections.c99practices.eg00pipeline;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    List <String> persons = new ArrayList<>();
    
    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    persons.stream()  
      .forEach(person -> System.out.println(person));
  }
}

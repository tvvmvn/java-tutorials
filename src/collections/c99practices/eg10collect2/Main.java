package collections.c99practices.eg10collect2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    
    List<String> persons = new ArrayList<>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");
    persons.add("Steve Jobs");

    List<String> personsWithJ = persons.stream()  
      .filter(person -> person.toLowerCase().indexOf("j") > -1)
      .collect(Collectors.toList());

    System.out.println(personsWithJ);
  }
}

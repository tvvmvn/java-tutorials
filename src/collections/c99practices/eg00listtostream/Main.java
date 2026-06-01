package collections.c99practices.eg00listtostream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    
    List <String> persons = new ArrayList<>();
    
    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    Stream <String> personsStream =  persons.stream();

    System.out.println(personsStream);
  }
}

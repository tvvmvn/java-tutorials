package dive.d80functionalinterface.eg03usage;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    List<String> persons = new ArrayList<>();

    persons.add("John Doe");
    persons.add("Jane Doe");
    persons.add("Mary Doe");

    // 람다를 입력받는 forEach 메서드
    persons.forEach(person -> System.out.println(person));
  }
}

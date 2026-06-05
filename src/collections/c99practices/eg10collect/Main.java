package collections.c99practices.eg10collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    List<Integer> ages = new ArrayList<>();

    ages.add(12);
    ages.add(18);
    ages.add(22);
    ages.add(34);

    List<Integer> adults = ages.stream()
      .filter(age -> age >= 18)
      .collect(Collectors.toList()); // 수집

    System.out.println(adults);
  }
}
package collections.c99practices.eg00dictionary;

import java.util.HashMap;
import java.util.Map;

public abstract class Main {
  public static void main(String[] args) {
    
    Map<String, Integer> fruits = new HashMap<>();
    
    fruits.put("Apple", 1000);
    fruits.put("Orange", 800);
    fruits.put("Mango", 1200);
    fruits.put("Kiwi", 700);
    fruits.put("Strawberry", 1500);
    
    // 과일바구니 현재상태
    System.out.println("과일들");
    for (String fruit : fruits) {
      
    }
    fruits.forEach((fruit, price) -> {
      System.out.printf("과일: %s, 가격: %d원\n", fruit, price);
    });

    // 과일 개수 체크
    System.out.println(fruits.size());

    // 키위 얼마에요?
    System.out.println(fruits.get("Kiwi"));

    // 가격 업데이트
    fruits.put("Orange", 700);
    fruits.put("Mango", 1300);

    // 딸기 판매종료
    fruits.remove("Strawberry");

    // 새 과일 입고!
    fruits.put("Banana", 500);

    // 딸기 있나요?
    System.out.println(fruits.containsKey("Strawberry"));

    // 과일바구니 현재상태
    System.out.println("과일들");
    fruits.forEach((fruit, price) -> {
      System.out.printf("과일: %s, 가격: %d원\n", fruit, price);
    });
  }
}

package dive.d80lambda.eg28create;

// 함수형 인터페이스
@FunctionalInterface
interface Person {
  void greeting();
}

public class Main {
  public static void main(String[] args) {

    // 익명 클래스보다 더 간단하게 메서드 구현 가능!
    Person korean = () -> System.out.println("안녕하세요!");
    Person japanese = () -> System.out.println("곤니치와!");
    
    korean.greeting();
    japanese.greeting();
  }
}

package dive.eg30functionalinterface;

// 함수형 인터페이스 정의
@FunctionalInterface
interface MyFI {
  int take(int a, int b);
}

public class Main {
  public static void main(String[] args) {
    
    // 인터페이스 구현 (함수 정의)
    MyFI add = (a, b) -> a + b;

    // 활용하기
    int result = add.take(1, 2);

    System.out.println(result);
  }
}

// 3
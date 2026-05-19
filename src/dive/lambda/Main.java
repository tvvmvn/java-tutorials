package more.lambda;

import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    // 제곱을 수행하는 람다 정의
    Consumer<Integer> square = n -> System.out.println(n * n);

    // 람다 호출
    square.accept(12);
  }  
}

// 144
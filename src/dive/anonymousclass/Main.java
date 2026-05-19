package more.anonymousclass;

import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    // 제곱을 수행하는 함수 정의
    Consumer<Integer> square = new Consumer<>() {
      @Override
      public void accept(Integer n) {
        System.out.println(n * n);
      }
    };

    square.accept(12);
  }  
}

// 144
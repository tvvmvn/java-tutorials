package dive.eg25anonymousclass;

import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    
    // 제곱을 수행하는 함수를 빠르게 정의하고 싶어
    Consumer<Integer> square = new Consumer<>() {
      @Override
      public void accept(Integer n) {
        System.out.println(n * n);
      }
    };

    square.accept(11);
    square.accept(12);
    square.accept(13);
  }  
}

// 144
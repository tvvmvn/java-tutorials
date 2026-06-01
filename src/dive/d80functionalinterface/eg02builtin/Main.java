package dive.d80functionalinterface.eg02builtin;

import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    
    // 제곱을 수행하는 함수를 빠르게 정의하고파
    Consumer<Integer> doSquare = n -> System.out.println(n * n);

    // 람다 호출
    doSquare.accept(11);
    doSquare.accept(12);
    doSquare.accept(13);
  }  
}

// 144
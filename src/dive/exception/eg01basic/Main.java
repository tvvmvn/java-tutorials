package dive.exception.eg01basic;

public class Main {
  public static void main(String[] args) {

    // 예외를 발생시키는 코드 (0으로 나누기)
    int n = 2 / 0;
  
    System.out.println(n);
  }
}

// ArithmeticException: / by zero
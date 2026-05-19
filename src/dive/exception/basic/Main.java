package more.exception.basic;

public class Main {
  public static void main(String[] args) {
    // 예외를 발생시키는 코드 (0으로 나누기)
    int n = 2 / 0;
  
    System.out.println(n);
  }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at exceptionhandling.basic.Main.main(Main.java:6)
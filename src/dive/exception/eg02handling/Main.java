package dive.exception.eg02handling;

public class Main {
  public static void main(String[] args) {
    
    try {
      int divisor = 0;
      int n = 2 / divisor;

      System.out.println(n);

    } catch (Exception e) {
      System.out.println("Exception: " + e);
      System.out.println("message: " + e.getMessage());
    }

    System.out.println("계속 진행..");
  }
}

// Exception: java.lang.ArithmeticException: / by zero
// 계속 진행..
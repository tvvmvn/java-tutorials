package dive02exception.eg03finally;

public class Main {
  public static void main(String[] args) {

    try {
      int n = 2 / 0;

      System.out.println(n);
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    } finally {
      System.out.println("예외 처리문 종료");
    }

  }
}

// Exception: java.lang.ArithmeticException: / by zero
// 예외 처리문 종료
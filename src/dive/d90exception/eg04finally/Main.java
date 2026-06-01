package dive.d90exception.eg04finally;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int age;

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("몇 살이니?");

    try {
      age = scanner.nextInt();
      System.out.println("나이: " + age);

    } catch (Exception e) {
      System.err.println("Exception: " + e);
    } finally {
      scanner.close();
    }
  }
}

// Exception: java.lang.ArithmeticException: / by zero
// 예외 처리문 종료
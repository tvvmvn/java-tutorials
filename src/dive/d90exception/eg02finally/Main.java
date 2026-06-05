package dive.d90exception.eg02finally;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int age;

    try {
      System.out.print("몇 살이니? ");
      age = scanner.nextInt(); // 입력값이 정수가 아니면 예외를 던짐

      System.out.println("나이: " + age);

    } catch (Exception e) {
      System.out.println("예외 발생! " + e.getClass());
    } finally {
      // 자원 해제
      scanner.close();
    }

  }
}

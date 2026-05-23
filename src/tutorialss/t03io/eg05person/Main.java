package tutorialss.t03io.eg05person;

// 스캐너
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String name;
    int age;

    Scanner scanner = new Scanner(System.in);

    System.out.print("이름이 뭐니? ");
    name = scanner.nextLine();

    System.out.print("몇 살이야? ");
    age = scanner.nextInt();

    System.out.printf("이름: %s, 나이: %d살", name, age);

    scanner.close();
  }
}

package t03io.eg06person;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String name;
    int age;

    Scanner scanner = new Scanner(System.in);

    System.out.print("이름: ");
    name = scanner.nextLine();

    System.out.print("나이: ");
    age = scanner.nextInt();

    System.out.printf("이름: %s, 나이: %d살", name, age);

    scanner.close();
  }
}

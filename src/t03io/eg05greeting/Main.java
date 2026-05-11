package t03io.eg05greeting;

// Scanner 가져오기
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String name;
    Scanner scanner = new Scanner(System.in);

    System.out.print("이름이 뭐니? ");
    name = scanner.nextLine();

    System.out.printf("안녕 %s!", name);

    scanner.close();
  }
}

package tutorials.t03io.eg06login;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String username;
    String password;

    Scanner scanner = new Scanner(System.in);

    System.out.print("아이디: ");
    username = scanner.nextLine();

    System.out.print("비밀번호: ");
    password = scanner.nextLine();

    System.out.printf("로그인 정보 - 아이디: %s, 비밀번호: %s", username, password);

    scanner.close();
  }
}

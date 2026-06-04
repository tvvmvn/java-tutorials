package projects1.bankaccounts;

import java.util.Scanner;

class Account  {
  
  int balance = 0;
  StringBuilder history = new StringBuilder();

  void withdraw(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("마이너스 출금 시도!");
    }
    balance -= amount;
  }

  void deposit(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("마이너스 입금 시도!");
    }
    balance += amount;
  }

  void transfer(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("마이너스 입금 시도!");
    }
  }

  void setHistory(String content) {
    history
      .append(content)
      .append("\n");
  }

  StringBuilder getHistory() {
    return history;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();

    String command;
    
    while (true) {
      // UI start
      System.out.println();
      System.out.println("<나의 은행계좌>");
      System.out.println("----------");
      System.out.println("잔액: " + account.balance);
      System.out.println("거래 내역: ");
      System.out.println(account.getHistory());
      System.out.println("----------");
      System.out.println("예금: [deposit 금액] 출금: [withdraw 금액] 송금: [transfer 이름 금액] 종료: bye");
      System.out.println("----------");
      System.out.print(">>>");
      // UI end

      command = scanner.nextLine();

      String[] arr = command.split(" ", 2);

      if ("bye".equals(arr[0])) {
        System.out.println("bye bye");
        scanner.close();
        return;
      }

      try {
        if ("deposit".equals(arr[0])) {
          int amount = Integer.parseInt(arr[1]);
          account.deposit(amount);
          account.setHistory(amount + "원 입금");
          System.out.println("성공적으로 " + amount + "원 입금했습니다");
        } else if ("withdraw".equals(arr[0])) {
          int amount = Integer.parseInt(arr[1]);
          account.withdraw(amount);
          account.setHistory(amount + "원 출금");
          System.out.println("성공적으로 " + amount + "원 출금했습니다");
        } else if ("transfer".equals(arr[0])) {
          String[] d = arr[1].split(" ");
          String to = d[0];
          int amount = Integer.parseInt(d[1]);
          account.balance -= amount;
          String h = String.format("%d 송금 (%s)", amount, to);
          account.setHistory(h);
          System.out.printf("성공적으로 %s에게 %d원 보냈습니다.", to, amount);
        } else {
          System.out.println("유효하지 않은 명령입니다.");
        }
      } catch (Exception e) {
        System.out.println("에러 발생: " + e.getMessage());
      }
    }
  }
}

package projects1.bankaccounts;

import java.util.Scanner;


class Account  {
  
  private int balance = 0;

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("마이너스 입금 시도!");
    }
    balance += amount;
  }

  public void withdraw(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("마이너스 출금 시도!");
    } else if (amount > balance) {
      throw new IllegalArgumentException("잔액이 부족합니다");
    }
    balance -= amount;
  }

  public void transfer(String to, int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("마이너스 송금 시도!");
    } else if (amount > balance) {
      throw new IllegalArgumentException("잔액이 부족합니다");
    }
    balance -= amount;
  }
}


class Historian {
  
  private StringBuilder history = new StringBuilder();

  public Historian() {}

  public void setHistory(String content) {
    history
      .append(content)
      .append("\n");
  }

  public StringBuilder getHistory() {
    return history;
  }
}

class Controller {
  
  View view;
  private Account account = new Account();
  Historian historian = new Historian();

  public Controller(View view) {
    this.view = view;
  }

  // GET
  void list() {
    view.printIndex(account.getBalance(), "...");
  }

  // POST
  void saveMoney(String amountString) {
    try {
      int amount = Integer.parseInt(amountString);
      account.deposit(amount);
      historian.setHistory(amount + "원 입금");
      String message = "성공적으로 " + amount + "원 입금했습니다";
      view.printIndex(account.getBalance(), message);
      
    } catch (IllegalArgumentException e) {
      System.out.println("ex: " + e.getMessage());
    }
  }

  // POST
  void getMoney(String amountString) {
    try {
      int amount = Integer.parseInt(amountString);
      account.withdraw(amount);
      historian.setHistory(amount + "원 출금");
      
      String message = "성공적으로 " + amount + "원 출금했습니다";
      view.printIndex(account.getBalance(), message);

    } catch (IllegalArgumentException e) {
      System.out.println("ex: " + e.getMessage());
    }
  }

  // POST
  void sendMoney(String to, String amountString) {
    try {
      int amount = Integer.parseInt(amountString);
      account.transfer(to, amount);
      
      historian.setHistory(amount + "원 송금" + to);

      String message = String.format("성공적으로 %s에게 %d원 송금했습니다", to, amount);
      view.printIndex(account.getBalance(), message);

    } catch (IllegalArgumentException e) {
      System.out.println("ex: " + e.getMessage());
    }
  }

  // GET
  void showHistory() {
    String history = historian.getHistory().toString();
    view.printHistory(history);
  }
}

class View {
  void printIndex(int balance, String message) {
    System.out.println();
    System.out.println("<나의 은행계좌>");
    System.out.println("----------");
    System.out.println("잔액: " + balance);
    System.out.println(message);
    System.out.println("예금: deposit 금액 | 출금: withdraw 금액 | 송금: transfer 이름 금액");
    System.out.println("거래내역 보기: showh | 종료: exit");
    System.out.println("----------");
  }

  void printHistory(String history) {
    System.out.println();
    System.out.println("거래 내역: ");
    System.out.println(history);
    System.out.println("----------");
    System.out.println("돌아가기: index | 종료: exit");
  }
}

class CommandHandler {
  
  private Controller controller;
  private Scanner scanner = new Scanner(System.in);

  public CommandHandler(Controller controller) {
    this.controller = controller;
  }
  
  void run() {
    String userInput;
    controller.list();
    while (true) {
      System.out.print("> "); 
      userInput = scanner.nextLine().trim();
      String[] parsedInput = userInput.split(" ");
      String command = parsedInput[0];
      
      if ("index".equals(command)) {
        controller.list();
      } else if ("deposit".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("입금액을 입력하세요");
          continue;
        }
        controller.saveMoney(parsedInput[1]);
      } else if ("withdraw".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("출금액을 입력하세요");
          continue;
        }
        controller.getMoney(parsedInput[1]);
      } else if ("transfer".equals(command)) {
        if (parsedInput.length < 3) {
          System.out.println("올바른 형식이 아닙니다");
          continue;
        }
        controller.sendMoney(parsedInput[1], parsedInput[2]);
      } else if ("showh".equals(command)) {
        controller.showHistory();
      } else if ("exit".equals(command)) {
        System.out.println("bye");
        break;
      } else {
        System.out.println("유효하지 않은 명령입니다.");
      }
    }
    scanner.close();
  }
}

public class Main {
  public static void main(String[] args) {
    View view = new View();
    Controller controller = new Controller(view);
    CommandHandler commandHandler = new CommandHandler(controller);
    commandHandler.run();    
  }
}

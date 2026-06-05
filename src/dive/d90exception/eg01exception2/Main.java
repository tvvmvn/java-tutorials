package dive.d90exception.eg01exception2;

class Account {
  int balance;

  void deposit(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("유효하지 않은 금액");
    }
    balance += amount;
  }
}

public class Main {
  public static void main(String[] args) {
    Account account = new Account();

    try {
      account.deposit(-50);
  
      System.out.println("입금이 완료되었습니다");
      
    } catch (Exception e) {
      System.out.println("예외 발생! " + e.getMessage());
    }
    
  }
}
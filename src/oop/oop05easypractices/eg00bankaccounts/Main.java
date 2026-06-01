package oop.oop05easypractices.eg00bankaccounts;

class BankAccount {

  private int balance = 0;
  
  void deposit(int amount) {
    if (amount < 0) {
      System.out.println("");
      return;
    }
    balance += amount;
  }
  
  void withdraw(int amount) {
    if (amount < 0) {
      System.out.println("");
      return;
    }
    balance -= amount;
  }

  public int getBalance() {
    return balance;
  }
}

public class Main {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();

    myAccount.deposit(1000);
    myAccount.deposit(2000);

    System.out.println(myAccount.getBalance());

    myAccount.withdraw(500);

    System.out.println(myAccount.getBalance());
  }
}

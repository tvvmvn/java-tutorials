package t09function.eg02args2;

public class Main {
  
  static void isAdult(int age) {
    if (age >= 18) {
      System.out.println("성인입니다");
    } else {
      System.out.println("성인이 아닙니다");
    }
  }

  public static void main(String[] args) {
    isAdult(10);
    isAdult(18);
    isAdult(23);
  }
}

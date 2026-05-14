package t09function.eg03return2;

public class Main {
  
  static boolean isAdult(int age) {
    return age >= 18;
  }

  public static void main(String[] args) {

    boolean result = isAdult(30);

    System.out.println(result);
  }
}

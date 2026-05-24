package tutorials.t09function.eg04overloading;

public class Main {

  static void add(int a, int b) {
    System.out.println(a + b);
  }

  static void add(double a, double b) {
    System.out.println(a + b);
  }
  
  public static void main(String[] args) {
    add(1, 2);
    add(1.5, 2.5);
  }
}

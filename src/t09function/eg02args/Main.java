package t09function.eg02args;

public class Main {
  
  static void add(int a, int b) {
    System.out.printf("%d + %d = %d\n", a, b, a + b);
  }

  public static void main(String[] args) {
    add(1, 2);
    add(3, 4);
    add(4, 5);
  }
}

// 1 + 2 = 3
// 3 + 4 = 7
// 4 + 5 = 9
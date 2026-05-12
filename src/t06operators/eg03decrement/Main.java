package t06operators.eg03decrement;

public class Main {
  public static void main(String[] args) {
    int a = 1;
    int b = 1;

    System.out.printf("a=%d, b=%d\n", --a, b--);
    System.out.printf("a=%d, b=%d\n", a, b);
  }
}

// a=0, b=1
// a=0, b=0
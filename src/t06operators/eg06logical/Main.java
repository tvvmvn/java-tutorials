package t06operators.eg06logical;

public class Main {
  public static void main(String[] args) {
    boolean a = 1 > 0;
    boolean b = 1 < 0;

    System.out.println(a && b);
    System.out.println(a || b);
    System.out.println(!b);
  }
}

// false
// true
// true

package tutorials.t10practices2.lv01multiplication;

public class Main {

  static void createMultiplicationChart(int n) {

    if (n < 1 || n > 9) {
      System.out.println("1부터 9사이의 값만 가능합니다.");
      return;
    }

    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", n, i, n * i);
    }
  }

  public static void main(String[] args) {
    createMultiplicationChart(5);
    createMultiplicationChart(10);
  }
}

package tutorialss.t10practices2.lv02max;

public class Main {

  static int getMax(int a, int b, int c) {

    int tmp = a > b ? a : b;

    return tmp > c ? tmp : c;
  }

  public static void main(String[] args) {
    int r = getMax(3, 7, 5);

    System.out.println(r);
  }
}

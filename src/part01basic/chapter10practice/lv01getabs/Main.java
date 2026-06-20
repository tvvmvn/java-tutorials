package part01basic.chapter10practice.lv01getabs;

public class Main {

  static int getAbs(int n) {
    if (n < 0) {
      return n * -1;
    }
    return n;
  }

  public static void main(String[] args) {
    System.out.println(getAbs(-4));
    System.out.println(getAbs(0));
    System.out.println(getAbs(8));
  }
}

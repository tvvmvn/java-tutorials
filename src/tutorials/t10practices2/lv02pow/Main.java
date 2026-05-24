package tutorials.t10practices2.lv02pow;

public class Main {

  static int pow(int base, int exp) {
    
    int result = 1;

    for (int i = 1; i <= exp; i++) {
      result *= base;
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(pow(2, 0));
    System.out.println(pow(2, 1));
    System.out.println(pow(2, 2));
    System.out.println(pow(2, 10));
  }
}

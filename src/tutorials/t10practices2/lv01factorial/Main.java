package tutorials.t10practices2.lv01factorial;

public class Main {

  static int getFactorial(int n) {

    int result = 1;

    for (int i = 1; i <= n; i++) {
      result *= i;
    }

    return result;
  }

  public static void main(String[] args) {
    
    System.out.println(getFactorial(5));
    System.out.println(getFactorial(4));
    System.out.println(getFactorial(3));
    System.out.println(getFactorial(2));
    System.out.println(getFactorial(1));
  }
}

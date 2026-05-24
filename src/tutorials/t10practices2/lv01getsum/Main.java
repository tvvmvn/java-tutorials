package tutorials.t10practices2.lv01getsum;

public class Main {
  public static void main(String[] args) {
    
    int evensum = 0, oddsum = 0;

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        evensum += i;
      } else {
        oddsum += i;
      }
    }

    System.out.println(evensum);
    System.out.println(oddsum);
  }
}

package t10practices2.lv02cartesian;

public class Main {
  public static void main(String[] args) {
    
    int[] a = {1, 2, 3, 4};
    int[] b = {7, 8, 9};

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        System.out.printf("(%d, %d) ", a[i], b[j]);
      }
      System.out.println();
    }
  }
}


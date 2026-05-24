package tutorials.t10practices.lv02array10x;

public class Main {

  static void doubleArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 10;
    }
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};

    doubleArray(arr);

    for (int item : arr) {
      System.out.println(item);
    }
  }
}

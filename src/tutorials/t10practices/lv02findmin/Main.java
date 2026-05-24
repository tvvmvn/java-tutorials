package tutorials.t10practices.lv02findmin;

public class Main {

  public static void main(String[] args) {
    
    int[] arr = {23, 15, 39, 21, 18, 54, 36, 13, 17};

    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    } 

    System.out.println(min);
  }
}

package t10practices.lv02findIndexOf;

public class Main {
  
  public static void main(String[] args) throws Exception {

    int[] arr = {5, 9, 2, 3, 8, 1, 7, 2};
    int target = 7;
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        index = arr[i];
      }
    }

    System.out.println(index);
  }
}

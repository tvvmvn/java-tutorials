package t10practices.lv02findIndexOf;

public class Main {
  
  static int indexOf(int[] arr, int target) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    
    return -1;
  }

  public static void main(String[] args) throws Exception {

    int[] arr = {5, 9, 2, 3, 8, 1, 7, 2};

    System.out.println(indexOf(arr, 7));
    System.out.println(indexOf(arr, 3));
    System.out.println(indexOf(arr, 11));
  }
}

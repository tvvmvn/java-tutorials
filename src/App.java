
public class App {

  static int findIndexOf(int[] arr, int itemToFind) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == itemToFind) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) throws Exception {

    int[] arr = {5, 9, 2, 3, 8, 1, 7, 2};

    int result = findIndexOf(arr, 7);

    System.out.println(result);
  }
}

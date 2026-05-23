package tutorialss.t10practices2.lv01findindex;

public class Main {
  
  public static void main(String[] args) throws Exception {

    int[] arr = {5, 9, 2, 3, 8, 1, 7, 2};
    
    // input
    int target = 9;
    
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        index = i;
      }
    }

    System.out.println(index);
  }
}

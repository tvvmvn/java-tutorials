package tutorialss.t08forloop.eg05looparray2;

public class Main {
  public static void main(String[] args) {
    
    int[] arr = {10, 20, 30, 40, 50};

    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 10;
    }

    System.out.println(arr[0]);
  }
}

package tutorialss.t05string.eg08split2;

public class Main {
  public static void main(String[] args) {

    String data = "apple,banana,orange,mango";

    String[] fruits = data.split(",");

    System.out.println(fruits[2]);
  }
}

// John
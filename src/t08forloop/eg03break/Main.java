package t08forloop.eg03break;

public class Main {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if (i == 6) {
        break;
      }
      System.out.println(i + "회차");
    }
  }
}
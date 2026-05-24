package tutorials.t08whileloop.eg03break;

public class Main {
  public static void main(String[] args) {
    
    int i = 1;

    while (i <= 10) {
      System.out.println(i + "회차");
      
      if (i == 5) {
        break;
      }
      
      i++;
    }
  }
}
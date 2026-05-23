package tutorialss.t10practices.lv01printadults;

public class Main {
  public static void main(String[] args) {
    
    int[] ages = {12, 15, 21, 32, 38};

    System.out.println("Adults: ");
    for (int age : ages) {
      if (age >= 18) {
        System.out.println(age);
      }
    }
  }
}

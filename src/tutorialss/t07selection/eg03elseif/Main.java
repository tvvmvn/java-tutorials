package tutorialss.t07selection.eg03elseif;

public class Main {
  public static void main(String[] args) {
    
    int age = 20;

    if (age < 18) {
      System.out.println("성인이 아닙니다");
    } else if (age >= 18 && age < 30) {
      System.out.println("20대 입니다");
    } else if (age >= 30 && age < 40) {
      System.out.println("30대 입니다");
    } else {
      System.out.println("40대 이상입니다");
    }
  }
}

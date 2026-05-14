package t10practices.lv01getgrade;

public class Main {

  static char getGrade(int score) {

    if (score >= 90) {
      return 'A';
    } else if (score < 90 && score >= 80) {
      return 'B';
    } else if (score < 80 && score >= 70) {
      return 'C';
    } else if (score < 70 && score >= 60) {
      return 'D';
    } else {
      return 'F';
    }
  }
  
  public static void main(String[] args) {

    System.out.println(getGrade(92));
    System.out.println(getGrade(88));
    System.out.println(getGrade(71));
  }
}

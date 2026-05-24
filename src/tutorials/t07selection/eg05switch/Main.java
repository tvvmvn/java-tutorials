package tutorials.t07selection.eg05switch;

public class Main {
  public static void main(String[] args) {
    
    int level = 3;

    switch (level) {
      case 1:
        System.out.println("Lv.1");
        break;
      case 2:
        System.out.println("Lv.2");
        break;
      case 3:
        System.out.println("Lv.3");
        break;
      case 4:
        System.out.println("Lv.4");
        break;
      case 5:
        System.out.println("Lv.5");
        break;
      default: //option
        System.out.println("Unknown Level");
    }
  }
}


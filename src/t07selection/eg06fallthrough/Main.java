package t07selection.eg06fallthrough;

public class Main {
  public static void main(String[] args) {
    
    int level = 3;

    switch(level) {
      case 1:
      case 2:
        System.out.println("Beginner");
        break;
      case 3:
      case 4:
        System.out.println("Amateur");
        break;
      case 5:
        System.out.println("Master");
    }
  }
}

// Amateur
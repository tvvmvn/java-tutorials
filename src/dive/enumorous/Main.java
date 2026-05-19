package more.enumorous;

enum ArrowKeys {
  UP,
  LEFT,
  RIGHT,
  DOWN,
}

public class Main {
  public static void main(String[] args) {
    // 사용자가 클릭한 키
    ArrowKeys clickedKey = ArrowKeys.RIGHT;

    if (clickedKey == ArrowKeys.RIGHT) {
      System.out.println("go to right");
    }
  }
}

// go to right
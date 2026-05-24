package dive01basic.d03enum.eg00basic;

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

    switch (clickedKey) {
      case ArrowKeys.RIGHT:
        System.out.println("Turn Right");
      
      case ArrowKeys.LEFT:
        System.out.println("Turn Left");
      
      case ArrowKeys.UP:
        System.out.println("Go Up");
      
      case ArrowKeys.DOWN:
        System.out.println("Go Down");
    }
  }
}

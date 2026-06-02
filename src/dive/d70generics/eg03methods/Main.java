package dive.d70generics.eg03methods;

public class Main {

  // <T> return_type 함수이름
  static <T> void info(T d) {
    System.out.println("입력값 정보");
    System.out.println("자료형: " + d.getClass().getName());
    System.out.println("값: " + d);
    System.out.println();
  }

  public static void main(String[] args) {
    info(99);
    info(2.0);
    info("hello");
    info(true);
  }
}

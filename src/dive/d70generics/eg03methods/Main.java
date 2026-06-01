package dive.d70generics.eg03methods;

public class Main {

  // <T> return_type 함수이름
  static <T> void info(T d) {
    System.out.println("입력값 정보:");
    System.out.printf("타입: %s\n", d.getClass().getName());
    System.out.printf("값: %s\n", d);
    System.out.println();
  }

  public static void main(String[] args) {
    info(100);
    info(2.0);
    info("hello");
  }
}

// 입력값 정보:
// 타입: java.lang.Integer
// 값: 100

// 입력값 정보:
// 타입: java.lang.Double
// 값: 2.0

// 입력값 정보:
// 타입: java.lang.String
// 값: hello
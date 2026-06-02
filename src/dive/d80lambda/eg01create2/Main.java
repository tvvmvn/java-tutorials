package dive.d80lambda.eg01create2;

// 함수형 인터페이스
@FunctionalInterface
interface GetMax {
  int get(int a, int b);
}

public class Main {
  public static void main(String[] args) {

    GetMax getMax = (a, b) -> a > b ? a : b;

    System.out.println(getMax.get(3, 2));
    System.out.println(getMax.get(5, 1));
    System.out.println(getMax.get(4, 6));
  }
}

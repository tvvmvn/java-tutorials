package dive.d80lambda.eg01create;

// 함수형 인터페이스
@FunctionalInterface
interface GetSquare {
  void print(int n);
}

public class Main {
  public static void main(String[] args) {

    GetSquare getSquare = n -> System.out.println(n * n);

    getSquare.print(11);
    getSquare.print(12);
    getSquare.print(13);
  }
}

package dive.d80lambda.eg01create2;

// 함수형 인터페이스
@FunctionalInterface
interface Singer {
  void song();
}

public class Main {
  public static void main(String[] args) {

    Singer singer = () -> System.out.println("");

    singer.song();
  }
}

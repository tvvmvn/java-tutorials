import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {

    Consumer<Integer> getSquare = new Consumer<>() {
      public void accept(Integer n) {
        System.out.println(n * n);
      };
    };

    getSquare.accept(11);
  }
}
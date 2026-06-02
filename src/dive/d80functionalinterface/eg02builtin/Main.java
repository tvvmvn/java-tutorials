package dive.d80functionalinterface.eg02builtin;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    
    Supplier<String> supplier = () -> "데이터";
    System.out.println(supplier.get());

    Consumer<Integer> consumer = (n) -> System.out.println(n);
    consumer.accept(2);

    Function<String, Integer> function = (s) -> s.length();
    System.out.println(function.apply("foo"));

    Predicate<Integer> predicate = (n) -> n > 0;
    System.out.println(predicate.test(2));

  }
}
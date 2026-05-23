package dive.optional;

import java.util.Optional;

public class Main {

  public static void main(String[] args) {

    Optional<String> s = Optional.of("foo");

    System.out.println(s);
  }
}

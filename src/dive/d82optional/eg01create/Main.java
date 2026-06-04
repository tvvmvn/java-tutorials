package dive.d82optional.eg01create;

import java.util.Optional;

public class Main {

  public static void main(String[] args) {

    Optional<String> opt1 = Optional.of("foo");
    Optional<String> opt2 = Optional.ofNullable("foo");
    Optional<String> opt3 = Optional.ofNullable(null);
    Optional<String> opt4 = Optional.empty();

    System.out.println(opt1);
    System.out.println(opt2);
    System.out.println(opt3);
    System.out.println(opt4);
  }
}

// Optional[foo]
// Optional[foo]
// Optional.empty
// Optional.empty

package dive.d80optional.eg01create;

import java.util.Optional;

public class Main {

  public static void main(String[] args) {

    Optional<String> opt1 = Optional.of("hello");
    Optional<String> opt2 = Optional.ofNullable("hello");
    Optional<String> opt3 = Optional.ofNullable(null);
    Optional<String> opt4 = Optional.empty();

    System.out.println(opt1);
    System.out.println(opt2);
    System.out.println(opt3);
    System.out.println(opt4);
  }
}

// Optional[hello]
// Optional[hello]
// Optional.empty
// Optional.empty

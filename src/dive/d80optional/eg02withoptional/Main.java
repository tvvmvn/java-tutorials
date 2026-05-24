package dive.d80optional.eg02withoptional;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    
    String name = "John Doe";

    Optional<String> nameOpt = Optional.ofNullable(name);

    int length = nameOpt.
      map(s -> s.length())
      .orElse(0);

    System.out.println(length);
  }
}

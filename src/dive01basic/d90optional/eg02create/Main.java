package dive01basic.d90optional.eg02create;

import java.util.Optional;

public class Main {

  public static void main(String[] args) {

    // 1. 절대 null이 아닌 객체를 담을 때 (null 넣으면 즉시 NPE 발생)
    Optional<String> opt1 = Optional.of("Hello");

    // 2. null일 수도 있고 아닐 수도 있는 객체를 담을 때 (가장 자주 사용)
    Optional<String> opt2 = Optional.ofNullable("maybeNullString");

    // 3. 빈 Optional 객체를 만들 때
    Optional<String> opt3 = Optional.empty();
  }
}

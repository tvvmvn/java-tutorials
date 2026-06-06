import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    
    Map<String, Consumer<String>> m = new HashMap<>();

    m.put("dance", (d) -> System.out.println(d));

    Consumer<String> consumer =  m.get("dance");

    consumer.accept("dancing!");
  }
}
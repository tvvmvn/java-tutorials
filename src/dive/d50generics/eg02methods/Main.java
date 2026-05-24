package dive.d50generics.eg02methods;

public class Main {
  
  // <T> return_type
  static <T> void info(T d) {
    System.out.println("data info:");
    System.out.printf("type: %s\n", d.getClass().getName());
    System.out.printf("value: %s\n", d);
  }

  public static void main(String[] args) {
    info(100);
    info("hello");
  }
}

// data info:
// type: java.lang.Integer
// value: 100
// data info:
// type: java.lang.String
// value: hello
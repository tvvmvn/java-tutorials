package t05string.eg07equals;

public class Main {
  public static void main(String[] args) {
    String s1 = "foo";
    String s2 = "foo";
    String s3 = "bar";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
  }
}

// true
// false
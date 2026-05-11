package t05string.eg05indexof;

public class Main {
  public static void main(String[] args) {
    String s = "foo";

    System.out.println(s.indexOf('f'));
    System.out.println(s.indexOf('o'));
    System.out.println(s.indexOf("fo"));
    System.out.println(s.indexOf('z'));
  }
}

// 0
// 1
// 0
// -1
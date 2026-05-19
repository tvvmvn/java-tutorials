package t10practices2.lv01stringlength;

public class Main {

  static int length(char[] s) {
    int length = 0;

    for (char c : s) {
      length++;
    }

    return length;
  }

  public static void main(String[] args) {

    char[] s = {'f', 'o', 'o'};

    System.out.println(length(s));
  }
}

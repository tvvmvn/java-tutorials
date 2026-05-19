package t10practices2.lv02comparestr;

public class Main {

  static boolean equals(char[] s1, char[] s2) {

    if (s1.length != s2.length) {
      return false;
    }

    for (int i = 0; i < s1.length; i++) {
      if (s1[i] != s2[i]) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    
    char[] s1 = {'f', 'o', 'o'};
    char[] s2 = {'f', 'o', 'o'};
    char[] s3 = {'b', 'a', 'r'};

    System.out.println(equals(s1, s2));
    System.out.println(equals(s1, s3));
  }
}

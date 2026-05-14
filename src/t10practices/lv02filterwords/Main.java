package t10practices.lv02filterwords;

public class Main {

  static boolean hasBadWords(String text) {

    String[] badWords = {"바보", "똥개", "말미잘"};

    for (String badWord : badWords) {
      if (text.indexOf(badWord) >= 0) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    
    System.out.println(hasBadWords("안녕 친하게지내자"));
    System.out.println(hasBadWords("아니 바보야"));
    System.out.println(hasBadWords("야 말X잘!"));
  }
}

package dive02exception.eg04throwing;

public class Main {
  public static void main(String[] args) {

    int age = 14;

    try {
      if (age < 18) {
        // 예외를 생성하고 catch로 던집니다
        throw new RuntimeException("18세 이상만 가능합니다");
      }
  
      System.out.println("통과!");
      
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }

  }
}

// Exception: 18세 이상만 가능합니다
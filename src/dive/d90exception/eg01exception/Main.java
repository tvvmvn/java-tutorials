package dive.d90exception.eg01exception;

class User {
  String username;

  void setUsername(String username) {
    if (username.length() < 5) {
      throw new IllegalArgumentException("유효하지 않은 아이디");
    }
    this.username = username;
  }
}

public class Main {

  public static void main(String[] args) {

    User user = new User();
    
    try {
      user.setUsername("j");
      // 기타 가입 과정

      System.out.println("가입이 완료되었습니다");

    } catch (Exception e) {
      System.out.println("예외 발생! " + e.getMessage());
    }

  }
}
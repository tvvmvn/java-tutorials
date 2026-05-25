package oop.oop04practices.eg27violatesrp;

class User {
  String username;
  String password;

  User(String username, String password) {
    this.username = username;
    this.password = password;
  }
}

class Controller {
  String signUp(String username, String password) {

    // DB와 통신하며 기존 회원인지 검증합니다
    System.out.println("가입된 아이디인지 검사중..");
    System.out.println("아이디: " + username);
    System.out.println("존재하지 않는 아이디. 가입을 계속합니다");

    // 유저를 생성하고 DB에 저장합니다.
    User user = new User(username, password);
    System.out.println("DB에 저장: " + user.username);

    // 클라이언트에게 전송할 데이터를 반환합니다
    return user.username;
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 모든 것을 처리하는 하나의 객체
    Controller controller = new Controller();
    
    // 클라이언트가 전송한 가입 정보
    String username = "johndoe";
    String password = "1234";

    // 서버의 응답
    String response = controller.signUp(username, password);
    System.out.println(response);
  }
}

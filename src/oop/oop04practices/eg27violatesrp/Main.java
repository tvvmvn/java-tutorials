package oop.oop04practices.eg27violatesrp;

class Controller {
  void signUp(String username, String password) {

    // DB와 통신하며 기존 회원인지 검증합니다
    System.out.println("가입된 아이디인지 검사중: " + username);
    System.out.println("존재하지 않는 아이디. 가입을 계속합니다");

    // 유저를 DB에 저장합니다.
    System.out.println("다음 사용자를 데이터베이스에 저장합니다.");
    System.out.printf("{username=%s, password=%s}\n", username, password);
    System.out.println("저장 완료");
    
    // 클라이언트에게 응답을 전송합니다.
    System.out.println("가입이 완료되었습니다 " + username + "님!");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 모든 것을 처리하는 하나의 객체
    Controller controller = new Controller();
    
    // 클라이언트가 전송한 가입 정보
    String username = "johndoe";
    String password = "1234";

    controller.signUp(username, password);
  }
}

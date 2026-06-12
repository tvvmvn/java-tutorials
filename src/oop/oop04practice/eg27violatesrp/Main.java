package oop.oop04practice.eg27violatesrp;

// DB 통신, 로직, 클라이언트와 통신을 모두 책임지는 객체
class Controller {
  void signUp(String username, String password) {

    // DB를 검색해서 이미 가입된 사용자인지 확인합니다.
    System.out.printf("DB 검색 결과: %s는 가입된 아이디가 아닙니다\n", username);
    System.out.println("가입을 계속합니다");

    // 가입된 사용자가 아니면 DB에 저장합니다.
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

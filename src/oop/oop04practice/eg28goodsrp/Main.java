package oop.oop04practice.eg28goodsrp;

// DAO
class UserRepository {
  void findUserByUsername(String username) {
    System.out.printf("DB 검색 결과: %s는 가입된 아이디가 아닙니다\n", username);
    System.out.println("가입을 계속합니다");
  }

  void save(String username, String password) {
    System.out.println("다음 사용자를 데이터베이스에 저장합니다.");
    System.out.printf("{username=%s, password=%s}\n", username, password);
    System.out.println("저장 완료");
  }
}

// 로직
class UserService {
  UserRepository userRepository;

  UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // 가입 처리의 핵심 로직
  void register(String username, String password) {

    // DAO에게 아이디 중복 체크를 요청합니다
    userRepository.findUserByUsername(username);

    // DB에 저장을 요청합니다.
    userRepository.save(username, password);
  }  
} 

// 클라이언트와 통신
class UserController {
  UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  // 클라이언트와 소통하는 계층
  void signUp(String username, String password) {

    // 가입 로직을 처리합니다
    userService.register(username, password);

    // 클라이언트에게 응답을 전송합니다.
    System.out.println("가입이 완료되었습니다 " + username + "님!");
  }
}

public class Main {
  public static void main(String[] args) {

    UserRepository userRepository = new UserRepository();
    UserService userService = new UserService(userRepository);
    UserController userController = new UserController(userService);

    // 서버에 전송된 가입 요청 정보
    String username = "johndoe";
    String password = "1234";

    // 서버에서 가장 외부에 위치
    userController.signUp(username, password);
  }
}
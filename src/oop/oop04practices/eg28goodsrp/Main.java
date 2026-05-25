package oop.oop04practices.eg28goodsrp;

class User {
  String username;
  String password;

  User(String username, String password) {
    this.username = username;
    this.password = password;
  }
}

// DAO
class UserRepository {
  User findUserByUsername(String username) {
    return null;
  }

  User save(User user) {
    System.out.println("DB에 저장: " + user.username);
    return user;
  }
}

// 로직
class UserService {
  UserRepository userRepository;

  UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // 가입 처리의 핵심 로직
  String register(String username, String password) {
    // 중복 체크
    User user = userRepository.findUserByUsername(username);

    if (user != null) {
      return null;
    }

    // DB에 저장
    User savedUser = userRepository.save(new User(username, password));
    return savedUser.username;
  }  
} 

// 클라이언트와 통신
class UserController {
  UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  // 클라이언트와 소통하는 계층
  String signUp(String username, String password) {

    // 가입 로직을 처리합니다
    String newUser = userService.register(username, password);

    if (newUser != null) {
      // 클라이언트에게 응답을 전송
      return "새 회원: " + newUser;
    }

    return null;
  }
}


public class Main {
  public static void main(String[] args) {
    UserRepository userRepository = new UserRepository();
    UserService userService = new UserService(userRepository);
    UserController userController = new UserController(userService);

    // 요청
    String username = "johndoe";
    String password = "1234";

    // 응답
    String response = userController.signUp(username, password);
    System.out.println(response);
  }
}
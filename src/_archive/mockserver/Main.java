package _archive.mockserver;

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
  String register(String signUpDto) {

    String[] dto = signUpDto.split(",");
    String username = dto[0];
    String password = dto[1];

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
  String signUp(String signUpDto) {

    // 가입 로직을 처리합니다
    userService.register(signUpDto);

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
    String signUpDto = "johndoe,1234";

    // 응답
    String response = userController.signUp(signUpDto);
    System.out.println(response);
  }
}
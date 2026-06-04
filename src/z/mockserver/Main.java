package z.mockserver;

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

  void save(User user) {
    System.out.println("다음 사용자를 저장합니다: " + user.username);
  }
}

// 로직
class UserService {
  UserRepository userRepository;

  UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  String register(String signUpRequestDto) {

    String[] s = signUpRequestDto.split(" ");
    User user = userRepository.findUserByUsername(s[0]);

    if (user != null) {
      System.err.println("이미 가입된 유저!");
      return null;
    }

    System.out.println("가입 처리를 시작합니다");

    // DB에 저장을 요청합니다.
    userRepository.save(new User(s[0], s[1]));

    return s[0];// SignUpResponseDto
  }  
} 

// 클라이언트와 통신
class UserController {
  UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  // 클라이언트와 소통하는 계층
  String signUp(String signUpRequestDto) {

    // 클라이언트에게 응답을 전송합니다.
    return "응답: " + userService.register(signUpRequestDto);
  }
}

public class Main {
  public static void main(String[] args) {

    UserRepository userRepository = new UserRepository();
    UserService userService = new UserService(userRepository);
    UserController userController = new UserController(userService);

    // 서버에 전송된 가입 요청 정보
    String signUpRequestDto = "johndoe 1234";

    // 서버에서 가장 외부에 위치
    String signUpResponseDto = userController.signUp(signUpRequestDto);

    System.out.println(signUpResponseDto);
  }
}
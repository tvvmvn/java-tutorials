package dive.d82optional.eg02withoptional;

import java.util.Optional;

class User {
  int id;
  String username;

  User(int id, String username) {
    this.id = id;
    this.username = username;
  }
}

public class Main {

  static Optional<User> findUserById(int id) {
    
    User[] users = {
      new User(1, "johndoe"),
      new User(2, "janedoe"),
      new User(3, "marydoe"),
    };

    User resultUser = null;

    for (User user : users) {
      if (id == user.id) {
        resultUser = user;
      }
    }

    return Optional.ofNullable(resultUser);
  }

  public static void main(String[] args) {
    
    // Optional의 결과가 null인 경우를 처리하지 않으면 컴파일이 되지 않습니다.
    User user = findUserById(1)
      .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다"));

    // NPE를 발생시킬 수 있는 코드
    System.out.println("사용자 정보: " + user.username);
  }
}
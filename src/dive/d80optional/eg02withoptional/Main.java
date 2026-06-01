package dive.d80optional.eg02withoptional;

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
    
    // orElseThrow: Optional의 메서드. 객체를 반환하거나 예외를 던집니다
    User user = findUserById(1)
      .orElseThrow(() -> new RuntimeException("No user with id"));

    System.out.println("계속 진행..");
  }
}
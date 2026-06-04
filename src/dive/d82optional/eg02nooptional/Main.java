package dive.d82optional.eg02nooptional;

class User {

  int id;
  String username;

  User(int id, String username) {
    this.id = id;
    this.username = username;
  }
}

public class Main {

  static User findUserById(int id) {
    // DB
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

    return resultUser;
  }

  public static void main(String[] args) {
    
    User user = findUserById(1);

    // 개발자가 null 체크 코드를 추가하지 않으면 NPE가 발생할 수 있습니다.
    if (user == null) {
      throw new IllegalArgumentException("사용자를 찾을 수 없습니다.");
    }

    // NPE를 발생시킬 수 있는 코드
    System.out.println("사용자 정보: " + user.username);
  }
}
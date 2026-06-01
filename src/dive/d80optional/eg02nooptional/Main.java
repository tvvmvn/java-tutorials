package dive.d80optional.eg02nooptional;

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

    // null 체크
    if (user == null) {
      throw new RuntimeException("No user with id");
    }

    System.out.println("계속 진행..");
  }
}
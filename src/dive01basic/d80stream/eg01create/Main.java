package dive01basic.d80stream.eg01create;

import java.util.Arrays;

class User {
  String name;
  String address;

  User(String name, String address) {
    this.name = name;
    this.address = address;
  }

  String getName() {
    return name;
  }

  String getAddress() {
    return address;
  }
}

public class Main {
  public static void main(String[] args) {

    User[] users = new User[4];
    
    users[0] = new User("John Doe", "서울시");
    users[1] = new User("Jane Doe", "인천시");
    users[2] = new User("Mary Doe", "서울시");
    users[3] = new User("Steve Jobs", "서울시");

    // Before stream
    for (User user : users) {
      if ("서울시".equals(user.getAddress())) {
        System.out.println(user.getName());
      }
    }

    // After stream
    Arrays.stream(users)
      .filter(user -> "서울시".equals(user.getAddress()))
      .forEach((user) -> System.out.println(user.getName()));
  }
}

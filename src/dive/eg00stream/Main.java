package dive.eg00stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

    List<User>users = new ArrayList<>();
    
    users.add(new User("John Doe", "서울시"));
    users.add(new User("Jahn Doe", "인천시"));
    users.add(new User("Mary Doe", "서울시"));
    users.add(new User("Steve Jobs", "서울시"));

    // Before stream
    // List<String> seoulUserNames = new ArrayList<>();
    // for (User user : users) {
    //   if ("서울시".equals(user.getAddress())) {
    //     seoulUserNames.add(user.getName());
    //   }
    // }

    // After stream
    List<String> seoulUserNames = users.stream()
      .filter(user -> "서울시".equals(user.getAddress()))
      .map(User::getName)
      .collect(Collectors.toList());

    System.out.println(seoulUserNames);
  }
}

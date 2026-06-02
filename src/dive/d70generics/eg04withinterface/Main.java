package dive.d70generics.eg04withinterface;

class User {
  int id;
  String username;

  User(int id, String username) {
    this.id = id;
    this.username = username;
  }
}

interface Repository<T> {
  T findById(int id);
}

class UserRepository implements Repository<User> {
  @Override
  public User findById(int id) {
    return new User(1, "John Doe");
  }
}

public class Main {
  public static void main(String[] args) {
    Repository<User> userRepository = new UserRepository();

    System.out.println(userRepository.findById(1));
  }
}
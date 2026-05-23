package dive.exception.eg05customex;

class UserNotFoundException extends RuntimeException {
  //message
  UserNotFoundException(String message) {
    super(message);
  }
}

public class Main {
  public static void main(String[] args) {
    
    try {
      throw new UserNotFoundException("no user!");
    } catch (UserNotFoundException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("..");
  }
}

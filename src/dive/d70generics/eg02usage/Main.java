package dive.d70generics.eg02usage;

class User {

  String username;
  String email;

  User(String username, String email) {
    this.username = username;
    this.email = email;
  }

  @Override
  public String toString() {
    return String.format("User{username=%s, email=%s}", username, email);
  }
}

// 💡 <T>를 붙여 데이터 타입을 외부에서 결정하도록 위임합니다.
class ApiResponse<T> {

  int status;
  String message;
  T data; // ⭕ Object 대신 T를 사용!

  public ApiResponse(int status, String message, T data) {
    this.status = status;
    this.message = message;
    this.data = data;
  }

  int getStatus() {
    return status;
  }

  String getMessage() {
    return message;
  }

  T getData() {
    return data;
  } 
}

public class Main {
  public static void main(String[] args) {
    
    User user = new User("johndoe", "johndoe@example.com");
    
    ApiResponse<User> response = new ApiResponse<>(200, "success", user);

    System.out.println(response.getStatus());
    System.out.println(response.getMessage());
    System.out.println(response.getData());
  }
}
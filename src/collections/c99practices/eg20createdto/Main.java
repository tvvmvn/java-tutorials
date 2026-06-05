package collections.c99practices.eg20createdto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
  
  private int id;
  private String username;
  private String password;
  private String photoUrl;

  public User(int id, String username, String password, String photoUrl) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.photoUrl = photoUrl;
  }

  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getPhotoUrl() {
    return photoUrl;
  }
}

class UserSearchDto {
  
  private String username;
  private String photoUrl;

  public UserSearchDto(String username, String photoUrl) {
    this.username = username;
    this.photoUrl = photoUrl;
  }

  @Override
  public String toString() {
    return String.format("UserSearchDto{username=%s, photoUrl=%s}", username, photoUrl);
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 원본
    List<User> users = new ArrayList<>();
    users.add(new User(1, "johndoe", "xxx", "/johndoe.jpg"));
    users.add(new User(2, "janedoe", "xxx", "/janedoe.jpg"));
    users.add(new User(3, "marydoe", "xxx", "/marydoe.jpg"));

    // 조회용 사용자 목록을 생성합니다
    List<UserSearchDto> userSearchDtos = users.stream()
      .map(user -> new UserSearchDto(user.getUsername(), user.getPhotoUrl()))
      .collect(Collectors.toList());

    // 확인
    for (UserSearchDto userSearchDto : userSearchDtos) {
      System.out.println(userSearchDto);
    }
  }
}

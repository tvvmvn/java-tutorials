package collections.c99practices.eg00userposts;

import java.util.ArrayList;
import java.util.List;

class PostDto {

  int id;
  String photoUrl;
  String caption;

  PostDto(int id, String photoUrl, String caption) {
    this.id = id;
    this.photoUrl = photoUrl;
    this.caption = caption;
  }
}

class UserDto {
  
  String username;
  List<PostDto> posts;

  UserDto(String username, List<PostDto> posts) {
    this.username = username;
    this.posts = posts;
  }
}

public class Main {
  public static void main(String[] args) {
    
    // from DB
    List<PostDto> posts = new ArrayList<>();
    posts.add(new PostDto(1, "/photo1.jpg", "my photo 1"));
    posts.add(new PostDto(2, "/photo2.jpg", "my photo 2"));
    
    // Response data
    UserDto userDto = new UserDto("johndoe", posts);
  }
}

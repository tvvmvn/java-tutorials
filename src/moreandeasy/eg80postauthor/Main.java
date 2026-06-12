package moreandeasy.eg80postauthor;

class User {

  private int id;
  private String username;

  public User(int id, String username) {
    this.id = id;
    this.username = username;
  }

  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }
}

class Post {

  private int id;
  private String content;
  private User author;

  public Post(int id, String content, User author) {
    this.id = id;
    this.content = content;
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public User getAuthor() {
    return author;
  }
}

public class Main {
  public static void main(String[] args) {
    
    User user = new User(1, "johndoe");
    Post post = new Post(100, "자연 사진", user);

    // 100번 게시물의 작성자
    System.out.println(post.getAuthor().getUsername());
  }
}

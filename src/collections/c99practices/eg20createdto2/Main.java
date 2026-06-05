package collections.c99practices.eg20createdto2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Post {

  private int id;
  private String title;
  private String thumbnailUrl;
  private String content;

  public Post(int id, String title, String thumbnailUrl, String content) {
    this.id = id;
    this.title = title;
    this.thumbnailUrl = thumbnailUrl;
    this.content = content;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public String getContent() {
    return content;
  }
}

class PostListDto {
  
  private String thumbnailUrl;
  private String title;

  public PostListDto(String thumbnailUrl, String title) {
    this.thumbnailUrl = thumbnailUrl;
    this.title = title;
  }

  @Override
  public String toString() {
    return String.format("PostListDto{thumbnailUrl=%s, title=%s}", thumbnailUrl, title);
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 게시글 데이터
    List<Post> posts = new ArrayList<>();
    posts.add(new Post(1, "first post", "/first.jpg", "..."));
    posts.add(new Post(2, "second post", "/second.jpg", "..."));
    posts.add(new Post(3, "third post", "/third.jpg", "..."));

    // 게시글 목록용 
    List<PostListDto> postListDtos = posts.stream()
      .map(post -> new PostListDto(post.getThumbnailUrl(), post.getTitle()))
      .collect(Collectors.toList());

    // 확인하기
    for (PostListDto postListDto : postListDtos) {
      System.out.println(postListDto);
    }
  }
}

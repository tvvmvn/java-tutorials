package moreandeasy.eg85innerclass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Post {

  private String photoUrl;
  private String content;
  private int likeCount;
  private int authorId;

  public Post(String photoUrl, String content, int likeCount, int authorId) {
    this.photoUrl = photoUrl;
    this.content = content;
    this.likeCount = likeCount;
    this.authorId = authorId;
  }

  public String getPhotoUrl() {
    return photoUrl;
  }

  public String getContent() {
    return content;
  }

  public int getLikeCount() {
    return likeCount;
  }

  public int getAuthorId() {
    return authorId;
  }
}

class UserProfileDto {

  private String username;
  private String bio;
  private List<ProfilePost> posts;

  public UserProfileDto(String username, String bio, List<ProfilePost> posts) {
    this.username = username;
    this.bio = bio;
    this.posts = posts;
  }
  
  public static class ProfilePost {
    private String photoUrl;
    private int likeCount;

    public ProfilePost(String photoUrl, int likeCount) {
      this.photoUrl = photoUrl;
      this.likeCount = likeCount;
    }

    @Override
    public String toString() {
      return String.format("ProfilePost{photoUrl=%s, likeCount=%d}", photoUrl, likeCount);
    }
  }

  public String getUsername() {
    return username;
  }

  public String getBio() {
    return bio;
  }

  public List<ProfilePost> getPosts() {
    return posts;
  }
}

public class Main {
  public static void main(String[] args) {

    // john's posts from DB
    List<Post> johnPosts = new ArrayList<>();
    johnPosts.add(new Post("/1.jpg", "content1", 99, 1));
    johnPosts.add(new Post("/2.jpg", "content2", 99, 1));
    johnPosts.add(new Post("/3.jpg", "content3", 99, 1));

    List<UserProfileDto.ProfilePost> johnProfilePosts = johnPosts.stream()
      .map(post -> new UserProfileDto.ProfilePost(post.getPhotoUrl(), post.getLikeCount()))
      .collect(Collectors.toList());
    
    UserProfileDto johnProfileDto = new UserProfileDto("johndoe", "hello", johnProfilePosts);

    // Profile Page
    System.out.println(johnProfileDto.getUsername());
    System.out.println(johnProfileDto.getBio());
    for (UserProfileDto.ProfilePost post : johnProfileDto.getPosts()) {
      System.out.println(post);
    }
  }
}

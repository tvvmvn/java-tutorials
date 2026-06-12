package moreandeasy.eg90creatingfeed;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Follow {

  private User following;
  private User followed;

  public Follow(User following, User followed) {
    this.following = following;
    this.followed = followed;
  }

  public User getFollower() {
    return following;
  }

  public User getFollowed() {
    return followed;
  }
}

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

public class Main {
  public static void main(String[] args) {

    //johndoe

    // DB
    List<User> users = new ArrayList<>();
    users.add(new User(1, "johndoe"));
    users.add(new User(2, "janedoe"));
    users.add(new User(3, "marydoe"));
    users.add(new User(4, "stevejobs"));

    // data john is following
    List<Follow> follows = new ArrayList<>();
    follows.add(new Follow(users.get(0), users.get(1)));
    follows.add(new Follow(users.get(0), users.get(2)));
    
    // user's ids who johndoe is following
    List<Integer> followingIds = follows.stream() 
      .map(follow -> follow.getFollowed().getId())
      .collect(Collectors.toList());
    
    System.out.println(followingIds);
  }
}

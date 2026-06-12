package moreandeasy.eg70likepost;

import java.util.ArrayList;
import java.util.List;

class Photo {
  private int id;
  private String caption;
  private int likeCount;

  public Photo(int id, String caption, int likeCount) {
    this.id = id;
    this.caption = caption;
    this.likeCount = likeCount;
  }

  public int getId() {
    return id;
  }

  public String getCaption() {
    return caption;
  }

  public int getLikeCount() {
    return likeCount;
  }

  public void addLikeCount() {
    likeCount++;
  }
}

public class Main {
  public static void main(String[] args) {

    // like to post id=3
    int newLikedPhotoId = 2;

    // photos from DB
    List<Photo> photos = new ArrayList<>();
    photos.add(new Photo(1, "photo1", 4));
    photos.add(new Photo(2, "photo2", 8));
    photos.add(new Photo(3, "photo3", 99));

    for (Photo photo : photos) {
      if (newLikedPhotoId == photo.getId()) {
        photo.addLikeCount();
      }
    }

    System.out.println(photos.get(1).getLikeCount());
  }
}

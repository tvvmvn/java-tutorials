package oop.oop05easypractices.eg45likepost;

class Photo {
  int id;
  String caption;
  int likeCount;

  Photo(int id, String caption, int likeCount) {
    this.id = id;
    this.caption = caption;
    this.likeCount = likeCount;
  }
}

public class Main {
  public static void main(String[] args) {

    int likeId = 3;
    
    Photo[] photos = {
      new Photo(1, "", 5),
      new Photo(2, "", 10),
      new Photo(3, "", 99),
    };

    for (Photo photo : photos) {
      if (photo.id == likeId) {
        photo.likeCount++;
      }
    }

    for (Photo photo : photos) {
      System.out.println(photo.likeCount);
    }
  }
}

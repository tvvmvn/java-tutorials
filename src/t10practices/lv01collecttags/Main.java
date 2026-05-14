package t10practices.lv01collecttags;

public class Main {
  
  public static void main(String[] args) {
    
    String tags = "#맛집#좋반#칭구해요#갬성#부평핫플";

    String[] keywords = tags.split("#");

    for (String keyword : keywords) {
      System.out.println(keyword);
    }
  }
}

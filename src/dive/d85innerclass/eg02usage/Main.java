package dive.d85innerclass.eg02usage;

// dto는 자잘자잘한 클래스가 많아 관련된 클래스들을 이렇게 모으기도 합니다.
class PostDto { // 게시글 관련 dto 모음

  // 게시글 등록용
  public static class CreateRequest {
    private String title;
    private String content;

    public String getTitle() { return title; }
    public String getContent() { return content; }
  }

  // 게시글 수정용 
  public static class UpdateRequest {
    private String title;
    private String content;
    
    public String getTitle() { return title; }
    public String getContent() { return content; }
  }

  // 게시글 응답용 
  public static class Response {
    private Long id;
    private String title;
    private String content;

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
  }
}

public class Main {

}
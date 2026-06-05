package collections.c99practices.eg40parsingjson;

import java.util.HashMap;
import java.util.Map;

class OAuthAttributes {
  
  private int id;
  private String username;
  private Boolean isPremium;
  
  public OAuthAttributes(Map<String, Object> attributes) {
    this.id = (int) attributes.get("id");
    this.username = (String) attributes.get("username");
    this.isPremium = (Boolean) attributes.get("is_premium");
  }

  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }
  
  public Boolean getIsPremium() {
    return isPremium;
  }
}

public class Main {
  public static void main(String[] args) {

    // 카카오 서버에서 보낸 JSON을 스프링이 Map으로 파싱해 준 상태
    Map<String, Object> attributes = new HashMap<>();
    attributes.put("id", 987654321); // int 타입 들어옴
    attributes.put("username", "길동이"); // String 타입 들어옴
    attributes.put("is_premium", true); // Boolean 타입 들어옴

    // 우리꺼
    OAuthAttributes oAuthAttributes = new OAuthAttributes(attributes);

    System.out.println(oAuthAttributes.getId());
    System.out.println(oAuthAttributes.getUsername());
    System.out.println(oAuthAttributes.getIsPremium());
  }
}
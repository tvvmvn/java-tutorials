import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OAuthUserParser {
  public static void main(String[] args) {

    // 1. 카카오 서버에서 보낸 JSON을 스프링이 Map으로 파싱해 준 상태
    Map<String, Object> attributes = new HashMap<>();
    attributes.put("id", 987654321L); // Long 타입 들어옴
    attributes.put("nickname", "길동이"); // String 타입 들어옴
    attributes.put("is_premium", true); // Boolean 타입 들어옴

    // ---------------------------------------------------------
    // ⚡ [실무 핵심] 데이터 꺼내서 비즈니스 로직에 태우기
    // ---------------------------------------------------------

    // 💡 빽(Casting)의 필요성: Object로 묶여있으니 원래 타입으로 가방을 열어줘야 합니다.
    String kakaoName = (String) attributes.get("nickname");
    System.out.println("👤 유저 닉네임: " + kakaoName);

    // 💡 안전벨트 연계: 만약 카카오에서 "email"을 선택 동의 안 해서 null이 들어오면?
    // 아까 배운 Optional 에어백을 소환합니다.
    Optional<Object> emailOpt = Optional.ofNullable(attributes.get("email"));

    emailOpt.ifPresentOrElse(
        email -> {
          String userEmail = (String) email;
          System.out.println("📧 연동 이메일: " + userEmail);
        },
        () -> System.out.println("⚠️ 이메일 제공 동의를 하지 않은 유저입니다."));

    // 💡 조건 분기 활용
    boolean isVip = (boolean) attributes.get("is_premium");
    
    if (isVip) {
      System.out.println("👑 프리미엄 혜택을 적용합니다.");
    }
  }
}
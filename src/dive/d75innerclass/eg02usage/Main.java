package dive.d75innerclass.eg02usage;

class UserDto {

  // 💡 외부에 독립적으로 기생하는 정적(Static) 내부 클래스
  // 바깥 클래스(UserDto)의 인스턴스 생성 여부와 상관없이 단독으로 사용 가능합니다.
  public static class RegisterReq {
    private String email;
    private String password;
    private String nickname;

    public RegisterReq(String email, String password, String nickname) {
      this.email = email;
      this.password = password;
      this.nickname = nickname;
    }

    public String getEmail() {
      return email;
    }

    public String getPassword() {
      return password;
    }

    public String getNickname() {
      return nickname;
    }
  }

  // 💡 또 다른 응답용 정적 내부 클래스 (네임스페이스 관리 유용)
  public static class InfoRes {
    
    private Long id;
    private String email;

    public InfoRes(Long id, String email) {
      this.id = id;
      this.email = email;
    }

    public Long getId() {
      return id;
    }

    public String getEmail() {
      return email;
    }
  }
}

// =========================================================================
// 바깥(Main)에서 직접 호출하여 객체를 생성하는 방법
// =========================================================================
public class Main {
  public static void main(String[] args) {

    // ⭕ 바깥 껍데기 클래스의 new 없이, 'Outer.Inner' 구조로 곧바로 단독 생성 가능!
    UserDto.RegisterReq request = new UserDto.RegisterReq("user@test.com", "1234", "강사님");

    System.out.println("생성된 요청 이메일: " + request.getEmail());
  }
}
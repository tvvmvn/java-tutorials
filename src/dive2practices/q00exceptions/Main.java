package dive2practices.q00exceptions;

enum ErrorCode {
  
  MEMBER_NOT_FOUND("M404", "존재하지 않는 회원입니다."),
  INVALID_PASSWORD("M400", "비밀번호가 일치하지 않습니다."),
  DUPLICATE_EMAIL("M409", "이미 사용 중인 이메일입니다.");

  private final String code;
  private final String message;

  ErrorCode(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}

// 💡 클래스는 이거 하나만 만들어 두면 끝납니다!
class BusinessException extends RuntimeException {

  private final ErrorCode errorCode;

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage()); // 부모 RuntimeException에 메시지 전달
    this.errorCode = errorCode;
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }
}

public class Main {
  public static void main(String[] args) {
    // 이메일 중복 시
    if (isDuplicate) {
      throw new BusinessException(ErrorCode.DUPLICATE_EMAIL);
    }

    // 회원을 찾지 못했을 때
    Member member = memberRepository.findById(id)
        .orElseThrow(() -> new BusinessException(ErrorCode.MEMBER_NOT_FOUND));
  }
}
package oop.oop04practices.eg25delieverygood;

interface Authenticator {
  void authenticate();
}

class PasswordAuthenticator implements Authenticator {
  public void authenticate() {
    System.out.println("비밀번호 검증중");
  }
}

class FingerPrintAuthenticator implements Authenticator {
  public void authenticate() {
    System.out.println("지문 검증중");
  }
}

class FaceIDAuthenticator implements Authenticator {
  public void authenticate() {
    System.out.println("얼굴 검증중");
  }
}

class SystemOperator {
  // 
  Authenticator authenticator;

  SystemOperator(Authenticator authenticator) {
    this.authenticator = authenticator;
  }
  
  void activateSystem() {
    System.out.println("시스템 작동 준비중");
    System.out.println("자원 확보중...");
    
    // 인증 처리중
    authenticator.authenticate();

    System.out.println("인증 완료");
    System.out.println("시스템이 활성화되었습니다.");
  }
}

public class Main {
  public static void main(String[] args) throws Exception {
    
    String authMethods = "face-id";
    Authenticator authenticator;

    // 인증기를 선택중입니다
    if ("password".equals(authMethods)) {
      authenticator = new PasswordAuthenticator();
    } else if ("fingerprint".equals(authMethods)) {
      authenticator = new FingerPrintAuthenticator();
    } else if ("face-id".equals(authMethods)) {
      authenticator = new FaceIDAuthenticator();
    } else {
      System.out.println("알 수 없는 인증 방식입니다.");
      return;
    }

    // 인증기 전달
    SystemOperator systemOperator = new SystemOperator(authenticator);
    systemOperator.activateSystem();
  }
}


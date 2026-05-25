package oop.oop04practices.eg24delieverybad;

class PasswordAuthenticator {
  void authWithPassword() {
    System.out.println("비밀번호 검증중");
  }
}

class FingerPrintAuthenticator {
  void checkFingerPrint() {
    System.out.println("지문 검증중");
  }
}

class FaceIDAuthenticator {
  void FaceIDauthenticate() {
    System.out.println("얼굴 검증중");
  }
}

class SystemOperator {  
  void activateSystem(String authMethods) {
    System.out.println("시스템 작동 준비중");
    System.out.println("자원 확보중...");
    
    // 인증 절차
    if ("password".equals(authMethods)) {
      PasswordAuthenticator passwordAuthenticator = new PasswordAuthenticator();
      passwordAuthenticator.authWithPassword();
    } else if ("fingerprint".equals(authMethods)) {
      FingerPrintAuthenticator fingerPrintAuthenticator = new FingerPrintAuthenticator();
      fingerPrintAuthenticator.checkFingerPrint();
    } else if ("face-id".equals(authMethods)) {
      FaceIDAuthenticator faceIDAuthenticator = new FaceIDAuthenticator();
      faceIDAuthenticator.FaceIDauthenticate();
    } else {
      System.out.println("알 수 없는 인증 방식입니다.");
      return;
    }

    System.out.println("인증 완료");
    System.out.println("시스템이 활성화되었습니다.");
  }
}

public class Main {
  public static void main(String[] args) throws Exception {

    SystemOperator systemOperator = new SystemOperator();
    systemOperator.activateSystem("face-id");
  }
}


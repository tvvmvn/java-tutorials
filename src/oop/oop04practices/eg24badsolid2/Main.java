package oop.oop04practices.eg24badsolid2;

class PasswordAuthProcessor {
  void checkPassword() {
    System.out.println("비밀번호 검증중");
  }
}

class FingerPrintAuthenticator {
  void processAuth() {
    System.out.println("지문 검증중");
  }
}

class FaceIDProcessor {
  void authenticate() {
    System.out.println("얼굴 검증중");
  }
}

class SystemService {  
  void activateSystem(String authMethods) {
    System.out.println("시스템 작동 준비중");
    System.out.println("자원 확보중...");
    
    // 인증 절차
    if ("password".equals(authMethods)) {
      PasswordAuthProcessor passwordAuthProcessor = new PasswordAuthProcessor();
      passwordAuthProcessor.checkPassword();
    } else if ("fingerprint".equals(authMethods)) {
      FingerPrintAuthenticator fingerPrintAuthenticator = new FingerPrintAuthenticator();
      fingerPrintAuthenticator.processAuth();
    } else if ("face-id".equals(authMethods)) {
      FaceIDProcessor faceIDProcessor = new FaceIDProcessor();
      faceIDProcessor.authenticate();
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

    SystemService systemService = new SystemService();
    systemService.activateSystem("face-id");
  }
}


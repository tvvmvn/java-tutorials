package oop.oop04practices.eg93noadapter2;

interface Notification {
  void sendNotification(String phoneNumber, String content);
}

class SMSNotification implements Notification {
  public void sendNotification(String phoneNumber, String content) {
    System.out.printf("문자 메세지를 전송합니다: 전화번호=%s, 본문=%s", phoneNumber, content);
  }
}

// 3rd 라이브러리
class KakaoNotification {
  void sendNotificationMessage(String kakaoId, String message) {
    System.out.printf("카카오 메시지를 전송합니다: 카카오 아이디=%s, 메시지=%s", kakaoId, message);
  }
}

// 서비스
class NotificationSender {

  Notification notification;
  KakaoNotification kakaoNotification;

  NotificationSender(Notification notification) {
    this.notification = notification;
  }

  void processNotification(String what, String phoneNumber, String message) {
    System.out.println("알림 전송 준비..");

    if ("kakao".equals(what)) {
      notification.sendNotification(null, null);
    } else if ("phone".equals(what)) {
      KakaoNotification kakaoNotification = new KakaoNotification();
      
      System.out.println("핸드폰 정보로부터 카카오 아이디를 구하는 중..");

      String kakaoId = "johndoe";

      kakaoNotification.sendNotificationMessage(kakaoId, message);
    }

    System.out.println("전송 완료");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Notification smsNotification = new SMSNotification();
    NotificationSender notificationSender = new NotificationSender(smsNotification);

    notificationSender.processNotification("kakao", "010-xxxx-xxxx", "정기메시지입니다");
  }
}
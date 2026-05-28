package oop.oop04practices.eg94withadapter2;

interface Notification {
  void sendNotification(String email, String content);
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

// 어답터
class KakaoNotificationAdapter implements Notification {

  KakaoNotification kakaoNotification;

  KakaoNotificationAdapter(KakaoNotification kakaoNotification) {
    this.kakaoNotification = kakaoNotification;
  }

  @Override
  public void sendNotification(String phoneNumber, String content) {
    System.out.println("핸드폰 정보로부터 카카오 아이디를 구하는 중: " + phoneNumber);
    
    String kakaoId = "johndoe";

    kakaoNotification.sendNotificationMessage(kakaoId, content);
  }
}

// 서비스
class NotificationSender {

  Notification notification;

  NotificationSender(Notification notification) {
    this.notification = notification;
  }

  void processNotification(String phoneNumber, String message) {
    System.out.println("알림 전송 준비..");

    notification.sendNotification(phoneNumber, message);

    System.out.println("전송 완료");
  }
}

public class Main {
  public static void main(String[] args) {

    String methods = "kakao";
    Notification notification;

    if ("kakao".equals(methods)) {
      KakaoNotification kakaoNotification = new KakaoNotification();
      notification = new KakaoNotificationAdapter(kakaoNotification);
    } else if ("phone".equals(methods)) {
      notification = new SMSNotification();
    } else {
      System.out.println("알 수 없는 수단");
      return;
    }

    NotificationSender notificationSender = new NotificationSender(notification);
    notificationSender.processNotification("010-xxxx-xxxx", "정기메시지입니다");
  }
}
package oop.oop04practices.eg21paymentbad;

class ApplePayProcessor {
  void processPay() {
    System.out.println("애플페이 결제요청 처리중");
  }
}

class KakaoPayProcessor {
  void processPay() {
    System.out.println("카카오페이 결제요청 처리중");
  }
}

class NaverPayProcessor {
  void processPay() {
    System.out.println("네이버페이 결제요청 처리중");
  }
}

class OrderService {
  
  void processOrder(String payRequest) {
    System.out.println("주문이 접수되었습니다");
    
    // OCP 위반: 새 결제 수단이 추가되면 OrderService를 수정해야 한다 
    // 추상화 없음: OrderService가 여러가지 결제 처리기를 알아야 한다.
    // 다형성 없음: 결제 요청에 따라 각자 다른 결제 처리기가 사용됩니다.
    // + 처리기가 내부에서 생성되어 높은 결합도!
    if ("apple-pay".equals(payRequest)) {
      ApplePayProcessor applePayProcessor = new ApplePayProcessor();
      applePayProcessor.processPay();
    } else if ("kakao-pay".equals(payRequest)) {
      KakaoPayProcessor kakaoPayProcessor = new KakaoPayProcessor();
      kakaoPayProcessor.processPay();
    } else if ("naver-pay".equals(payRequest)) {
      NaverPayProcessor naverPayProcessor = new NaverPayProcessor();
      naverPayProcessor.processPay();
    } else {
      System.out.println("알 수 없는 결제요청");
      return;
    }
    
    System.out.println("주문이 완료되었습니다");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    OrderService orderService = new OrderService();
    orderService.processOrder("kakao-pay");
  }
}


package oop.oop04practices.q00paymentgood;

// ISP: 결제 처리자는 결제 처리만 담당합니다.
interface PayProcessor {
  void processPay();
}

class ApplePayProcessor implements PayProcessor {
  // LSP: 다른 일을 하는 것이 아니라 부모가 시킨 일(결제 처리)를 처리해야 합니다.
  public void processPay() { 
    System.out.println("애플페이 결제요청 처리중");
  }
}

class KakaoPayProcessor implements PayProcessor {
  public void processPay() { 
    System.out.println("카카오페이 결제요청 처리중");
  }
}

class NaverPayProcessor implements PayProcessor {
  public void processPay() { //LSP
    System.out.println("네이버페이 결제요청 처리중" );
  }
}
// OCP: 기존 코드의 변경없이 여기에 새 결제 수단을 추가할 수 있습니다.

// 핵심 로직에만 집중.
class OrderService {
  // DIP: 인터페이스에 의존함으로써 모든 PayProcessor 활용 가능.
  PayProcessor payProcessor;

  OrderService(PayProcessor payProcessor) {
    this.payProcessor = payProcessor;
  }

  void processOrder() {
    System.out.println("주문 접수");
    
    // 추상화: 결제 수단들에 대해 자세히 알 필요가 없다
    // 다형성: payProcessor가 모든 결제 요청을 처리할 수 있다!
    payProcessor.processPay(); 

    System.out.println("처리 완료");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    String payRequest = "kakao-pay";
    PayProcessor payProcessor;

    if ("apple-pay".equals(payRequest)) {
      payProcessor = new ApplePayProcessor();
    } else if ("kakao-pay".equals(payRequest)) {
      payProcessor = new KakaoPayProcessor();
    } else if ("naver-pay".equals(payRequest)) {
      payProcessor = new NaverPayProcessor();
    } else {
      System.out.println("알 수 없는 결제 요청");
      return;
    }

    OrderService orderService = new OrderService(payProcessor);
    orderService.processOrder();
  }
}

package _lab.paymentgood;

// ISP
interface PaymentProcessor {
  void processPay();
}

class ApplePay implements PaymentProcessor {
  public void processPay() { //LSP
    System.out.println("애플페이 결제요청 처리중");
  }
}

class KakaoPay implements PaymentProcessor {
  public void processPay() { 
    //LSP: 다른 일을 하는 것이 아니라 부모가 시킨 일(결제 처리)를 처리합니다.
    System.out.println("카카오페이 결제요청 처리중");
  }
}

class NaverPay implements PaymentProcessor {
  public void processPay() { //LSP
    System.out.println("네이버페이 결제요청 처리중" );
  }
}

// 기존 코드의 변경없이 새 결제 수단을 확장할 수 있습니다.

class OrderService {
  // DIP - 인터페이스에 의존합니다
  PaymentProcessor payment;

  OrderService(PaymentProcessor payment) {
    this.payment = payment;
  }

  void processOrder() {
    System.out.println("주문 접수");
    
    // 결제 처리
    payment.processPay(); // 다형성: processPay는 모든 결제처리 가능!
    // 추상화 - 인터페이스에 의존합니다.

    System.out.println("처리 완료");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    String payRequest = "kakao-pay";
    PaymentProcessor payment;

    if ("apple-pay".equals(payRequest)) {
      payment = new ApplePay();
    } else if ("kakao-pay".equals(payRequest)) {
      payment = new KakaoPay();
    } else if ("naver-pay".equals(payRequest)) {
      payment = new NaverPay();
    } else {
      System.out.println("알 수 없는 결제 요청");
      return;
    }

    OrderService orderService = new OrderService(payment);
    orderService.processOrder();
  }
}

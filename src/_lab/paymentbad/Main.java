package _lab.paymentbad;

class Payment {
  void processApplePay() {
    System.out.println("애플페이 결제요청 처리중");
  }

  void processKakaoPay() {
    System.out.println("카카오페이 결제요청 처리중");
  }

  void processNaverPay() {
    System.out.println("네이버페이 결제요청 처리중");
  }

  // 새 결제수단이 추가될 때마다 기존 클래스를 수정해야 합니다.
}

class OrderService {
  
  Payment payment;

  OrderService(Payment payment) {
    this.payment = payment;
  }

  void processOrder(String payRequest) {
    System.out.println("주문 접수");
    
    // 결제 수단이 추가될 때마다 OrderService를 수정해야 합니다.(결합도 증가)
    // Service가 결제 처리에 대해 자세히 알고 있어야 합니다 (추상화 없음)
    if ("apple-pay".equals(payRequest)) {
      payment.processApplePay();
    } else if ("kakao-pay".equals(payRequest)) {
      payment.processKakaoPay();
    } else if ("naver-pay".equals(payRequest)) {
      payment.processNaverPay();
    } else {
      System.out.println("알 수 없는 결제 요청");
      return;
    }
    
    System.out.println("처리 완료");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    Payment payment = new Payment();
    OrderService orderService = new OrderService(payment);
    orderService.processOrder("kakao-pay");
  }
}


package oop.oop04practice.eg90noadapter;

interface PayProcessor {
  void processPay();
}

// 기본 결제 처리자 
class DefaultPayProcessor implements PayProcessor {
  public void processPay() { 
    System.out.println("결제요청 처리중");
    System.out.println("처리 완료");
  }
}

// 외부 결제 API. 고칠 수 없음!
class PayPalAPI {
  public void handlePay(String apiKey) { 
    System.out.println("API 키 확인중: " + apiKey);
    System.out.println("페이팔 결제요청 처리중");
    System.out.println("처리 완료");
  }
}

class OrderService {
  PayProcessor payProcessor;

  OrderService(PayProcessor payProcessor) {
    this.payProcessor = payProcessor;
  }

  void processOrder() {
    System.out.println("주문 접수");
    System.out.println("결제를 시작합니다");

    payProcessor.processPay(); 
    
    System.out.println("주문 완료");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    PayProcessor payProcessor = new DefaultPayProcessor();
    OrderService orderService = new OrderService(payProcessor);

    orderService.processOrder();
  }
}

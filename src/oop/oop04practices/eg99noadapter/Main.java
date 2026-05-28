package oop.oop04practices.eg99noadapter;

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

  void processOrder(String payMethods) {
    System.out.println("주문 접수");
    System.out.println("결제를 시작합니다");

    if ("default-pay".equals(payMethods)) {
      payProcessor.processPay();
    } else if ("kakao-pay".equals(payMethods)) {
      // API 키 발급
      String apiKey = "secret-123";
      PayPalAPI payPalAPI = new PayPalAPI();
      payPalAPI.handlePay(apiKey);
    } else {
      System.out.println("알 수 없는 결제수단");
      return;
    }

    payProcessor.processPay(); 
    System.out.println("주문 완료");
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    PayProcessor payProcessor = new DefaultPayProcessor();
    OrderService orderService = new OrderService(payProcessor);

    orderService.processOrder("kakao-pay");
  }
}

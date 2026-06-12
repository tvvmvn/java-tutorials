package oop.oop04practice.eg92withadapter;

interface PayProcessor {
  void processPay();
}

// 결제 처리자 
class DefaultPayProcessor implements PayProcessor {
  public void processPay() { 
    System.out.println("결제요청 처리중");
    System.out.println("처리 완료");
  }
}

// 고칠수 없는 클래스
class PayPalAPI {
  public void handlePay(String apiKey) { 
    System.out.println("API 키 확인중: " + apiKey);
    System.out.println("페이팔 결제요청 처리중");
    System.out.println("처리 완료");
  }
}

class PayPalAdapter implements PayProcessor {
  
  PayPalAPI payPalAPI;
  String apiKey;

  PayPalAdapter(PayPalAPI payPalAPI, String apiKey) {
    this.payPalAPI = payPalAPI;
    this.apiKey = apiKey;
  }

  public void processPay() {
    this.payPalAPI.handlePay(apiKey);
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
    
    String payRequest = "paypal";
    PayProcessor payProcessor;

    if ("default-pay".equals(payRequest)) {
      payProcessor = new DefaultPayProcessor();
    } else if ("paypal".equals(payRequest)) {
      PayPalAPI payPalAPI = new PayPalAPI();
      String apiKey = "secret-123";
      payProcessor = new PayPalAdapter(payPalAPI, apiKey);
    } else {
      System.out.println("알 수 없는 결제 요청");
      return;
    }

    OrderService orderService = new OrderService(payProcessor);
    orderService.processOrder();
  }
}

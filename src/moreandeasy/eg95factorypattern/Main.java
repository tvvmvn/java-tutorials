package moreandeasy.eg95factorypattern;

import java.util.HashMap;
import java.util.Map;

interface PaymentProcessor {
  public void processPay();
}

class ApplePayProcessor implements PaymentProcessor {
  @Override
  public void processPay() {
    System.out.println("애플페이 처리중");
  }
}

class SamsungPayProcessor implements PaymentProcessor {
  @Override
  public void processPay() {
    System.out.println("삼성페이 처리중");
  }
}

class KakaoPayProcessor implements PaymentProcessor {
  @Override
  public void processPay() {
    System.out.println("카카오페이 처리중");
  }
}

public class Main {
  public static void main(String[] args) {
    
    String request = "samsung-pay";

    // 전략들을 한 곳에 보관
    Map<String, PaymentProcessor> paymentProcessors = new HashMap<>();
    paymentProcessors.put("apple-pay", new ApplePayProcessor());
    paymentProcessors.put("samsung-pay", new SamsungPayProcessor());
    paymentProcessors.put("kakao-pay", new KakaoPayProcessor());

    // 결제 처리
    PaymentProcessor paymentProcessor = paymentProcessors.get(request);
    paymentProcessor.processPay();
  }
}
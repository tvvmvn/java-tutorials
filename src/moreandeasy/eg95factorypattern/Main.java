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

class PaymentProcessorFactory {

    private static final Map<String, PaymentProcessor> payProcessors = new HashMap<>();

    static {
      payProcessors.put("apple-pay", new ApplePayProcessor());
      payProcessors.put("samsung-pay", new SamsungPayProcessor());
      payProcessors.put("kakao-pay", new KakaoPayProcessor());
    }

    static PaymentProcessor getPayProcessor(String payRequest) {
      return payProcessors.get(payRequest);
    }
}

public class Main {
  public static void main(String[] args) {
    
    String payRequest = "samsung-pay";

    // 결제 처리
    PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPayProcessor(payRequest);
    paymentProcessor.processPay();
  }
}
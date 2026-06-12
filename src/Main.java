import java.util.HashMap;
import java.util.Map;

interface PaymentProcessor {
  public void processPay();
}

class SamsungPayProcessor implements PaymentProcessor {
  @Override
  public void processPay() {
    System.out.println("삼성페이 처리중");
  }
}

class ApplePayProcessor implements PaymentProcessor {
  @Override
  public void processPay() {
    System.out.println("애플페이 처리중");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // add a b c
    String request = "samsung-pay";

    Map<String, PaymentProcessor> paymentProcessors = new HashMap<>();
    paymentProcessors.put("samsung-pay", new SamsungPayProcessor());
    paymentProcessors.put("apple-pay", new ApplePayProcessor());


  }
}
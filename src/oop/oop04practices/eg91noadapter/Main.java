package oop.oop04practices.eg91noadapter;

// =======================================================
// 1. 우리 시스템의 표준 규격 (Target Interface)
// =======================================================
interface Payment {
  void pay(int amount); // 우리는 원화(KRW) 정수값을 받는 것이 표준 규칙
}

class DefaultPaySystem implements Payment {
  public void pay(int amount) {
    System.out.println("￦" + amount + " 결제 완료!");
  }
}

// =======================================================
// 2. 외부 업체가 준 라이브러리 (Adaptee: 수정 불가하다고 가정)
// =======================================================
class BritishPaySystem {
  // 메서드 이름도 다르고, 금액도 double(파운드화)로 받아야만 함
  public void processBritishPayment(double poundAmount) {
    System.out.println("[영국 현지 결제] £" + poundAmount + " 파운드 결제 완료!");
  }
}

class PayService {

  Payment payment;
  BritishPaySystem britishPaySystem;

  PayService(Payment payment, BritishPaySystem britishPaySystem) {
    this.payment = payment;
    this.britishPaySystem = britishPaySystem;
  }

  // 임시로 국가 코드를 추가함
  void processPay(String countryCode, int krw) {
    System.out.println("[주문 시스템 확인] 결제 처리를 시작합니다.");

    if ("kr".equals(countryCode)) {
      payment.pay(krw);
    } else if ("uk".equals(countryCode)) {
      double poundAmount = krw / 1800.0;
      britishPaySystem.processBritishPayment(poundAmount);
    }

    payment.pay(krw);

    System.out.println("[주문 시스템 확인] 최종 주문 처리가 완료되었습니다.");
  }
}

// =======================================================
// 4. 실행 및 테스트 (Client)
// =======================================================
public class Main {
  public static void main(String[] args) {

    PayService payService;

    Payment paySystem = new DefaultPaySystem();
    BritishPaySystem britishPaySystem = new BritishPaySystem();
    payService = new PayService(paySystem, britishPaySystem);

    payService.processPay("kr", 3600);
    payService.processPay("uk", 3600);
  }
}
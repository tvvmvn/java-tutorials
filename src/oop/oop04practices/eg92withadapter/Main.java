package oop.oop04practices.eg92withadapter;

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

class BritishPayAdapter implements Payment {

  private final BritishPaySystem britishPaySystem;

  // 변환할 외부 라이브러리 객체를 주입받음
  public BritishPayAdapter(BritishPaySystem britishPaySystem) {
    this.britishPaySystem = britishPaySystem;
  }

  @Override
  public void pay(int amount) {
    // [번역 1] 우리 방식의 원화(int)를 영국 방식의 파운드화(double)로 환전
    double poundAmount = amount / 1800.0; // 환율 1,800원 가정

    // [번역 2] 우리 규격의 메서드 호출을 외부 업체의 메서드 호출로 매핑
    britishPaySystem.processBritishPayment(poundAmount);
  }
}

class PayService {

  Payment payment;

  PayService(Payment payment) {
    this.payment = payment;
  }

  void processPay(int price) {
    System.out.println("[주문 시스템 확인] 결제 처리를 시작합니다.");
    payment.pay(price);
    System.out.println("[주문 시스템 확인] 최종 주문 처리가 완료되었습니다.");
  }
}

// =======================================================
// 4. 실행 및 테스트 (Client)
// =======================================================
public class Main {
  public static void main(String[] args) {

    String payType = "uk";
    PayService payService;

   if ("kr".equals(payType)) {
      DefaultPaySystem paySystem = new DefaultPaySystem();
      payService = new PayService(paySystem);
    } else if ("uk".equals(payType)) {
      BritishPaySystem foreignSystem = new BritishPaySystem();
      // Adapter
      Payment adapter = new BritishPayAdapter(foreignSystem);
      payService = new PayService(adapter);
    } else {
      System.out.println("지원되지 않는 화폐");
      return;
    }

    payService.processPay(3600);
  }
}
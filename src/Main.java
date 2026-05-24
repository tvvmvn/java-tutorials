import java.util.UUID;

// ==========================================
// 1. 제품 인터페이스 (Product Interface)
// ==========================================
interface Payment {
  void processPayment(int amount);

  String getPaymentStatus();
}

// ==========================================
// 2. 구체적인 제품들 (Concrete Products)
// ==========================================
class CardPayment implements Payment {
  private final String cardNumber;
  private boolean isAuthorized = false;

  public CardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void processPayment(int amount) {
    System.out.println("[신용카드] " + maskCardNumber(cardNumber) + " 번호로 " + amount + "원 결제 요청 중...");
    // 실제로는 외부 PG사 연동 로직이 들어감
    this.isAuthorized = true;
    System.out.println("[신용카드] PG사 승인 완료.");
  }

  @Override
  public String getPaymentStatus() {
    return isAuthorized ? "CARD_SUCCESS" : "CARD_PENDING";
  }

  private String maskCardNumber(String number) {
    return number.substring(0, 4) + "-xxxx-xxxx-" + number.substring(number.length() - 4);
  }
}

class PayPayment implements Payment {
  private final String userId;
  private final String payProvider; // "KAKAO", "NAVER" 등
  private boolean isVerified = false;

  public PayPayment(String userId, String payProvider) {
    this.userId = userId;
    this.payProvider = payProvider;
  }

  @Override
  public void processPayment(int amount) {
    System.out.println("[" + payProvider + "페이] 유저 ID: " + userId + " 결제 인증 시도...");
    this.isVerified = true;
    System.out.println("[" + payProvider + "페이] 생체 인증 성공 및 " + amount + "원 출금 완료.");
  }

  @Override
  public String getPaymentStatus() {
    return isVerified ? payProvider + "_PAY_SUCCESS" : "PAY_FAILED";
  }
}

class CryptoPayment implements Payment {
  private final String walletAddress;
  private int confirmations = 0;

  public CryptoPayment(String walletAddress) {
    this.walletAddress = walletAddress;
  }

  @Override
  public void processPayment(int amount) {
    System.out.println("[가상자산] 지갑 주소: " + walletAddress);
    System.out.println("[가상자산] 가치 환산 후 " + amount + "원 상당의 블록체인 네트워크 트랜잭션 전송...");
    this.confirmations = 12; // 가상 블록 컨펌 수 설정
    System.out.println("[가상자산] 블록 검증 완료 (" + confirmations + " Confirmations).");
  }

  @Override
  public String getPaymentStatus() {
    return confirmations >= 6 ? "CRYPTO_CONFIRMED" : "CRYPTO_UNCONFIRMED";
  }
}

// ==========================================
// 3. 크리에이터 추상 클래스 (Creator - 핵심!)
// ==========================================
abstract class PaymentFactory {

  // 팩토리 메서드: 자식 클래스가 어떤 객체를 만들지 직접 오버라이딩함
  protected abstract Payment createPayment();

  // 템플릿 역할을 하는 기본 비즈니스 로직 (공통 작업 처리)
  public void orderPayment(int amount) {
    System.out.println("----------------------------------------");
    System.out.println("[시스템] 결제 파이프라인 가동... 트랜잭션 ID 발급: " + UUID.randomUUID());

    // 1. 자식이 오버라이딩한 팩토리 메서드로 실제 객체 생성 (동적 바인딩)
    Payment payment = createPayment();

    // 2. 공통 전처리 프로세스 (보안 검사, 약관 동의 확인 등)
    System.out.println("[시스템] 필수 보안 검사 통과.");

    // 3. 실제 제품의 기능 실행
    payment.processPayment(amount);

    // 4. 공통 후처리 프로세스 (영수증 저장, 로그 적재)
    System.out.println("[시스템] 결제 완료 상태 기록: " + payment.getPaymentStatus());
    System.out.println("[시스템] 디지털 영수증이 고객님께 발송되었습니다.");
    System.out.println("----------------------------------------\n");
  }
}

// ==========================================
// 4. 구체적인 크리에이터들 (Concrete Creators)
// ==========================================
class CardPaymentFactory extends PaymentFactory {
  private final String cardNumber;

  public CardPaymentFactory(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  protected Payment createPayment() {
    // 카드 결제에 필요한 특화 데이터를 바인딩하여 제품 반환
    return new CardPayment(cardNumber);
  }
}

class PayPaymentFactory extends PaymentFactory {
  private final String userId;
  private final String provider;

  public PayPaymentFactory(String userId, String provider) {
    this.userId = userId;
    this.provider = provider;
  }

  @Override
  protected Payment createPayment() {
    return new PayPayment(userId, provider);
  }
}

class CryptoPaymentFactory extends PaymentFactory {
  private final String walletAddress;

  public CryptoPaymentFactory(String walletAddress) {
    this.walletAddress = walletAddress;
  }

  @Override
  protected Payment createPayment() {
    return new CryptoPayment(walletAddress);
  }
}

// ==========================================
// 5. 클라이언트 실행 코드 (Client Application)
// ==========================================
public class Main {
  public static void main(String[] args) {
    System.out.println("=== 팩토리 메서드 패턴 결제 시스템 가동 ===");

    // 상황 1: 유저가 신용카드로 결제하길 원함
    PaymentFactory cardChannel = new CardPaymentFactory("1234-5678-9012-3456");
    cardChannel.orderPayment(55000);

    // 상황 2: 유저가 카카오페이로 결제하길 원함
    PaymentFactory kakaoChannel = new PayPaymentFactory("user_id_99", "KAKAO");
    kakaoChannel.orderPayment(12000);

    // 상황 3: 신규 기능 오픈 - 얼리어답터가 비트코인 지갑으로 결제하길 원함
    PaymentFactory cryptoChannel = new CryptoPaymentFactory("0x71C7656EC7ab88b098defB751B7401B5f6d8976F");
    cryptoChannel.orderPayment(850000);
  }
}
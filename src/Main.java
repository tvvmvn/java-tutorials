import java.util.ArrayList;
import java.util.List;

// ==========================================
// 1. 추상화 (Abstraction) & ISP (인터페이스 분리 원칙)
// ==========================================
// 결제 기능만 가지는 인터페이스 (ISP 만족)
interface PaymentProcessor {
    void processPayment(int amount);
}

// 환불 기능만 가지는 인터페이스 (ISP 만족)
interface Refundable {
    void processRefund(int amount);
}

// ==========================================
// 2. DIP (의존역전 원칙) & OCP (개방-폐쇄 원칙)
// ==========================================
// 상세 결제 수단(신용카드, 페이)은 이 추상적 인터페이스에 의존합니다.
interface PaymentMethod extends PaymentProcessor, Refundable {}

// ==========================================
// 3. 캡슐화 (Encapsulation)
// ==========================================
class User {
    private String name; // private으로 숨김
    private int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // getter/setter 및 비즈니스 메서드로만 데이터 접근 (캡슐화)
    public String getName() { return name; }
    public int getBalance() { return balance; }
    
    public void deductBalance(int amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        this.balance -= amount;
    }
}

// ==========================================
// 4. 상속 (Inheritance) & LSP (리스코프 치환 원칙)
// ==========================================
// 기본 결제 클래스
class BasicPayment implements PaymentMethod {
    protected String methodName;

    public BasicPayment(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println(methodName + "로 " + amount + "원 결제 시도");
    }

    @Override
    public void processRefund(int amount) {
        System.out.println(methodName + "로 " + amount + "원 환불 완료");
    }
}

// 상속을 통한 확장. 부모의 기능을 망가뜨리지 않으므로 LSP를 만족합니다.
class CreditCardPayment extends BasicPayment {
  
    public CreditCardPayment() {
        super("신용카드");
    }

    @Override
    public void processPayment(int amount) {
        super.processPayment(amount);
        System.out.println("-> 신용카드 승인 번호 생성 완료.");
    }
}

// 새로운 결제 수단 추가가 매우 쉬움 (OCP 만족)
class KakaoPayPayment extends BasicPayment {
    public KakaoPayPayment() {
        super("카카오페이");
    }
}

// ==========================================
// 5. SRP (단일 책임 원칙)
// ==========================================
// 오직 결제 이력을 로깅하는 책임만 가집니다.
class PaymentLogger {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

// 오직 결제 프로세스를 총괄하는 책임만 가집니다.
class PaymentService {
    private final PaymentMethod paymentMethod; // DIP: 구체 클래스가 아닌 인터페이스에 의존
    private final PaymentLogger logger;

    // 생성자 주입 (의존성 주입)
    public PaymentService(PaymentMethod paymentMethod, PaymentLogger logger) {
        this.paymentMethod = paymentMethod;
        this.logger = logger;
    }

    // 다형성 (Polymorphism) 활용
    // 어떤 결제 수단이 들어오든(CreditCard, KakaoPay 등) 코드는 변하지 않습니다.
    public void checkout(User user, int amount) {
        logger.log(user.getName() + "님의 결제 시작");
        user.deductBalance(amount);
        paymentMethod.processPayment(amount);
        logger.log("결제 성공. 남은 잔액: " + user.getBalance() + "원");
    }
}

// ==========================================
// 실행 메인 클래스
// ==========================================
public class Main {
    public static void main(String[] args) {
        User user = new User("홍길동", 50000);
        PaymentLogger logger = new PaymentLogger();

        // 1. 신용카드로 결제 진행
        PaymentMethod card = new CreditCardPayment();
        PaymentService service1 = new PaymentService(card, logger);
        service1.checkout(user, 20000);

        System.out.println("--------------------------------");

        // 2. 카카오페이로 결제 진행 (다형성에 의해 코드 수정 없이 교체 가능)
        PaymentMethod kakaoPay = new KakaoPayPayment();
        PaymentService service2 = new PaymentService(kakaoPay, logger);
        service2.checkout(user, 15000);
    }
}

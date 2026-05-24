package dive01basic.d03enum.eg00snippet;

enum Option {

  // 1. 상수 선언과 동시에 생성자를 통해 데이터(값)를 주입합니다.
  VIP(0.1, "최우수 회원"),
  GOLD(0.05, "우수 회원"),
  SILVER(0.0, "일반 회원");

  // 2. 필드 변수 정의
  private final double discountRate;
  private final String description;

  // 3. 생성자 (Enum 생성자는 무조건 private 권장, 외부에서 생성 불가)
  private Option(double discountRate, String description) {
    this.discountRate = discountRate;
    this.description = description;
  }

  // 4. 일반 메서드 제공
  public double getDiscountRate() {
    return discountRate;
  }

  public String getDescription() {
    return description;
  }

  // 비즈니스 로직 적용: 원래 금액을 넣으면 할인된 최종 금액을 계산해 주는 메서드
  public int calculateDiscount(int price) {
    return (int) (price * (1 - discountRate));
  }
}

public class Main {
  public static void main(String[] args) {

    Option userGrade = Option.VIP;

    System.out.println(userGrade); 
    System.out.println(userGrade.getDescription()); // 출력: 최우수 회원

    //
    int originalPrice = 10000;
    int finalPrice = userGrade.calculateDiscount(originalPrice);

    System.out.println("최종 결제 금액: " + finalPrice); // 출력: 9000
  }
}
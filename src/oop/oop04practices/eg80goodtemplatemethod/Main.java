package oop.oop04practices.eg80goodtemplatemethod;

abstract class DbQueryTemplate {

  // 1. 템플릿 메서드: 실행 흐름의 뼈대를 정의합니다.
  // 자식 클래스가 이 흐름 자체를 위조하지 못하도록 final을 붙입니다.
  public final void execute() {
    connectDb(); // 공통 흐름 1

    try {
      runBusiness(); // 🌟 핵심 흐름: 자식에게 구현을 위임 (구멍 뚫어놓기)
    } catch (Exception e) {
      System.err.println("[에러 발생] " + e.getMessage());
    } finally {
      closeDb(); // 공통 흐름 2
    }
  }

  // 2. 공통 메서드: 부모가 직접 구현하여 자식들이 재사용합니다.
  private void connectDb() {
    System.out.println("[DB] 🔌 데이터베이스에 안전하게 연결되었습니다.");
  }

  private void closeDb() {
    System.out.println("[DB] 🔒 연결을 종료하고 자원을 반납합니다.\n");
  }

  // 3. 훅(Hook) 또는 추상 메서드: 구체적인 처리는 자식 클래스가 정의합니다.
  protected abstract void runBusiness();
}

class FindUserQuery extends DbQueryTemplate {
  @Override
  protected void runBusiness() {
    // 나만의 핵심 로직만 구현
    System.out.println("[비즈니스] -> SELECT * FROM USERS WHERE id = 1 실행 중...");
    System.out.println("[비즈니스] -> 사용자 '홍길동'을 찾았습니다.");
  }
}

class FindProductQuery extends DbQueryTemplate {
  @Override
  protected void runBusiness() {
    // 나만의 핵심 로직만 구현
    System.out.println("[비즈니스] -> SELECT * FROM PRODUCTS 실행 중...");
    System.out.println("[비즈니스] -> 상품 목록 5건을 조회했습니다.");
  }
}

public class Main {
  public static void main(String[] args) {
    // 1. 회원 조회 실행
    DbQueryTemplate userQuery = new FindUserQuery();
    userQuery.execute();

    // 2. 상품 조회 실행
    DbQueryTemplate productQuery = new FindProductQuery();
    productQuery.execute();
  }
}
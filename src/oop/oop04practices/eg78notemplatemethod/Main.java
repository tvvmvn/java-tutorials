package oop.oop04practices.eg78notemplatemethod;

class FindUserQuery {
  void execute() {
    connectDb(); // 공통 흐름 1
    
    try {
      // 나만의 핵심 로직만 구현
      System.out.println("[비즈니스] -> SELECT * FROM USERS WHERE id = 1 실행 중...");
      System.out.println("[비즈니스] -> 사용자 '홍길동'을 찾았습니다.");

    } catch (Exception e) {
      System.err.println("[에러 발생] " + e.getMessage());
    } finally {
      closeDb();
    }
  }

  private void connectDb() {
    System.out.println("[DB] 🔌 데이터베이스에 안전하게 연결되었습니다.");
  }

  private void closeDb() {
    System.out.println("[DB] 🔒 연결을 종료하고 자원을 반납합니다.\n");
  }
}

class FindProductQuery {
  void execute() {
    connectDb();

    try {
      // 나만의 핵심 로직만 구현
      System.out.println("[비즈니스] -> SELECT * FROM PRODUCTS 실행 중...");
      System.out.println("[비즈니스] -> 상품 목록 5건을 조회했습니다.");
      
    } catch (Exception e) {
      System.err.println("[에러 발생] " + e.getMessage());
    } finally {
      closeDb(); // 얘들아 이거 빼먹지마ㅠ (강제할 수 없어)
    }
  }

  private void connectDb() {
    System.out.println("[DB] 🔌 데이터베이스에 안전하게 연결되었습니다.");
  }

  private void closeDb() {
    System.out.println("[DB] 🔒 연결을 종료하고 자원을 반납합니다.\n");
  }
}

public class Main {
  public static void main(String[] args) {
    // 1. 회원 조회 실행
    FindUserQuery userQuery = new FindUserQuery();
    userQuery.execute();

    // 2. 상품 조회 실행
    FindProductQuery productQuery = new FindProductQuery();
    productQuery.execute();
  }
}

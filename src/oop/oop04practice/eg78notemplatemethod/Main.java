package oop.oop04practice.eg78notemplatemethod;

// DB로부터 사용자를 검색하는 로직 처리
class FindUserQuery {
  void execute() {
    // DB와 통신을 시도합니다
    System.out.println("DB에 통신 시도중");
    System.out.println("DB에 연결되었습니다");
    
    // 사용자 검색
    System.out.println("데이터베이스 검색 중..");
    System.out.println("사용자 'John Doe'를 찾았습니다.");
    
    // DB 통신 종료
    System.out.println("DB와 통신을 종료합니다");
  }
}

// DB로부터 제품을 검색하는 로직 처리
class FindProductQuery {
  void execute() {
    // DB와 통신을 시도합니다
    System.out.println("DB에 연결 시도중");
    System.out.println("DB에 연결되었습니다");

    // 상품 검색
    System.out.println("데이터베이스 검색 중..");
    System.out.println("상품 '레고'를 찾았습니다.");

    // DB와 통신 종료
    System.out.println("DB와 연결을 종료합니다");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 사용자 검색하기
    FindUserQuery userQuery = new FindUserQuery();
    userQuery.execute();

    // 상품 검색하기
    FindProductQuery productQuery = new FindProductQuery();
    productQuery.execute();
  }
}

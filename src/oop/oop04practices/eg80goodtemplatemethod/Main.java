package oop.oop04practices.eg80goodtemplatemethod;

// 데이터베이스 검색의 뼈대 (Template)를 정의하는 클래스
abstract class DbQueryTemplate {

  // 1. 템플릿 메서드: 실행 흐름(뼈대)을 정의합니다.
  // 자식 클래스가 이 흐름을 위조하지 못하도록 final을 붙입니다.
  public final void execute() {
 // DB와 통신을 시도합니다
    System.out.println("DB에 통신 시도중");
    System.out.println("DB에 연결되었습니다");
    
    // 핵심 부분을 자식에게 위임합니다.
    runBusiness();
    
    // DB 통신 종료
    System.out.println("DB와 통신을 종료합니다");
    System.out.println("exit");
  }

  // 3. 훅(Hook) 또는 추상 메서드: 구체적인 처리는 자식 클래스가 정의합니다.
  abstract void runBusiness();
}

class FindUserQuery extends DbQueryTemplate {
  void runBusiness() {
    // 핵심 로직만 구현
    System.out.println("<사용자> 데이터베이스 검색 중..");
    System.out.println("사용자 'John Doe'를 찾았습니다.");
  }
}

class FindProductQuery extends DbQueryTemplate {
  void runBusiness() {
    // 핵심 로직만 구현
    System.out.println("<상품> 데이터베이스 검색 중..");
    System.out.println("상품 '레고'를 찾았습니다.");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 1 사용자 조회하기
    DbQueryTemplate userQuery = new FindUserQuery();
    userQuery.execute();

    // 2 상품 조회하기
    DbQueryTemplate productQuery = new FindProductQuery();
    productQuery.execute();
  }
}
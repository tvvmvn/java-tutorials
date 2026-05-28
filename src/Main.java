import java.sql.SQLException;

import javax.management.RuntimeErrorException;

abstract class AbstractDbExecutor<T> {
  
  public final List<T> execute(String sql) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    List<T>resultList = new ArrayList<>();

    try {
      conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

      stmt = conn.prepareStatement(sql);

      rs = executeQuery(stmt);

      while(rs.next()) {
        resultList.add(handleResult(rs));
      }
    } catch (SQLException e) {
      System.err.println("에러 발생: " + e.getMessage());
      throw new RuntimeErrorException(e);
    } finally {
      closeResources(rs, stmt, conn);
    }

    return resultList;
  }

  protected ResultSet executeQuery(PreparedStatement stmt) throws SQLException {
    return stmt.executeQuery();
  }

  protected abstract T handleResult(Result rs) throws SQLException {
    return null;
  }

  // 공통 자원해제 메서드
  private void closeResources(ResultSet rs, Statement stmt, Connection conn) {
    try {if (rs != null) rs.close()} catch (SQLException e) {}
    try {if (stmt != null) stmt.close()} catch (SQLException e) {}
    try {if (conn != null) conn.close()} catch (SQLException e) {}
    System.out.println("DB 자원을 종료합니다");
  }
}

class User {
  String name; String email;
  User(String name, String email) {
    this.name = name;
    this.email = email;
  }
}

class Product {
  String title; int price;
  Product(String title, int price) {
    this.title = title;
    this.price = price;
  }
}

// 유저 테이블 조회용 팩토리
class UserQueryExecutor extends AbstractDbExecutor<User> {
  @Override
  protected User handleResult(ResultSet rs) throws SQLException {
    return new User(rs.getString("username"), rs.getString("email"));
  }
}

// 상품 테이블 조회용 팩토리
class ProductQueryExecutor extends AbstractDbExecutor<Product> {
  @Override
  protected Product handleResult(ResultSet rs) throws SQLException {
    return new Product(rs.getString("product_name"), rs.getString("price"));
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("");

    //  H2 가상 드라이버 초기화
    try { 
      Class.forName("org.h2.Driver")
    } catch (ClassNotFoundException e) {}

    // 유저 조회요청
    AbstractDbExecutor<User> userExecutor = new UserQueryExecutor();
    System.out.println("회원 목록을 조회합니다");
    List<User> users = userExecutor.execute("SELECT username, email FROM users");

    // 상품 조회요청 처리
    AbstractDbExecutor<Product> productExecutor = new ProductQueryExecutor();
    System.out.println("상품 목록을 조회합니다");
    List<Product> products = productExecutor.execute("SELECT product_name, price FROM products");
  }
}
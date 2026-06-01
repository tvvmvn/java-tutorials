package dive.d60constant.eg01create;

class AppConfig {
  static final String DB_URL = "mysql://localhost:3306/mydb";
  static final String API_URL = "https://example.com/api/";
  static final int MAX_LOGIN_ATTEMPS = 5;
}

public class Main {
  public static void main(String[] args) {
    
    System.out.println(AppConfig.DB_URL);
    System.out.println(AppConfig.API_URL);
    System.out.println(AppConfig.MAX_LOGIN_ATTEMPS);
  }
}

package dive.d90exception.eg03throws;

import java.io.File;
import java.io.IOException;

public class Main {

  static boolean createFile(String name) throws IOException {

    File file = new File(name);

    // IOException(Checked Exception)을 던질 수 있는 메서드
    // 반드시 예외 처리를 해야합니다.
    // try-catch로 처리하거나 throws를 작성해야합니다.
    if (file.createNewFile()) {
      return true;
    }
    
    return false;
  }

  public static void main(String[] args) {
    try {
      createFile("foo");
      // 기타 예외가 발생할 수 있는 메서드들..

    } catch (IOException e) {// 이곳에서 일괄적으로 예외 처리를 합니다
      System.err.println(e.getMessage());
    }
  }
}
package dive.d90exception.eg05throws;

import java.io.File;
import java.io.IOException;

public class Main {

  static boolean createFile(String name) throws IOException {

    File file = new File(name);

    // 반드시 예외 처리를 해야하는 메서드. try-catch 또는 위로 전달하기(throws)
    if (file.createNewFile()) {
      return true;
    }
    
    return false;
  }

  public static void main(String[] args) {
    try {
      createFile("foo");
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
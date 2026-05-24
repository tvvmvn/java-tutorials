package dive02exception.eg05throws;

import java.io.File;
import java.io.IOException;

public class Main {

  // throws 필수
  static boolean createFile(String name) throws IOException {
    File file = new File(name);

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
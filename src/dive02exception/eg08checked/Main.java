package dive02exception.eg08checked;

import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {

    try {
      File file = new File("foo.txt");
  
      if (file.createNewFile()) {
        System.out.println("Done");
      } else {
        System.out.println("Already there");
      }
    } catch (IOException e) {
      System.err.println("Error!");
      e.printStackTrace();
    }
  }
}
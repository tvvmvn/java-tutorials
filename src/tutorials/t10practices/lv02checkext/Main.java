package tutorials.t10practices.lv02checkext;

public class Main {

  static String getExtension(String fileName) {

    int x = 1;

    int b = 2;

    return fileName.substring(fileName.lastIndexOf('.') + 1);
  }

  public static void main(String[] args) {

    System.out.println(getExtension("me.jpg"));
    System.out.println(getExtension("data.csv"));
    System.out.println(getExtension("view.pdf"));
  }
}

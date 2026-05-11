package t05string.eg08split;

public class Main {
  public static void main(String[] args) {

    String fullName = "John Doe";

    // 배열에 성과 이름을 저장합니다.
    String[] arr = fullName.split(" ");

    String firstName = arr[0];
    String lastName = arr[1];

    System.out.println(firstName);
    System.out.println(lastName);
  }
}

// John
// Doe
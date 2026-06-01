package dive.d90exception.eg03handling;

class Person {

  String name;

  void setName(String name) {
    if (name.length() < 3) {
      throw new IllegalArgumentException("잘못된 이름입니다");
    }
    this.name = name;
  }
}

public class Main {

  public static void main(String[] args) {

    try {
      Person person = new Person();
      person.setName("j");
  
      // 실행되면 안됨
      System.out.println("내 친구를 소개할게");
      System.out.println(person.toString());
    } catch (IllegalArgumentException e) {
      System.err.println("Exception: " + e.getMessage());
    }

    System.out.println("다시 시도하세요");
  }
}
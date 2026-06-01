package dive.d90exception.eg02withexception;

class Person {

  String name;

  void setName(String name) {
    if (name.length() < 3) {
      // 예외 발생시키기
      throw new IllegalArgumentException("잘못된 이름입니다");
    }
    this.name = name;
  }
}

public class Main {

  public static void main(String[] args) {

    Person person = new Person();
    person.setName("j");

    // 실행되면 안됨
    System.out.println("내 친구를 소개할게");
    System.out.println(person.toString());

    // 실행되야 함
    System.out.println("다시 시도하세요");
  }
}
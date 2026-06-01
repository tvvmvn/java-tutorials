package dive.d90exception.eg01noexception;

class Person {

  String name;

  void setName(String name) {
    if (name.length() < 3) {
      System.out.println("잘못된 이름입니다");
      return;
    }
    this.name = name;
  }
}

public class Main {
  public static void main(String[] args) {

    Person person = new Person();
    person.setName("j");

    if (person.name == null) {
      return;
    }
    
    // 실행되면 안됨
    System.out.println("내 친구를 소개할게");
    System.out.println(person.name);
  }
}
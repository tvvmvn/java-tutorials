package dive02exception.eg90withexception;

class Person {

  String name;
  int age;

  void setName(String name) {
    if (name.length() < 3) {
      throw new IllegalArgumentException("잘못된 이름입니다");
    }
    this.name = name;
  }

  void setAge(int age) {
    if (age < 18) {
      throw new IllegalArgumentException("미성년자입니다");
    }
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Person[name=%s, age=%d]", name, age);
  }
}

public class Main {

  public static void main(String[] args) {

    String name = "John Doe";
    int age = 10;
    
    try {
      Person person = new Person();
      person.setName(name);
      person.setAge(age);
  
      // 실행되면 안됨
      System.out.println("내 친구를 소개할게");
      System.out.println(person.toString());

    } catch (IllegalArgumentException e) {
      System.err.println("인자 예외: " + e.getMessage());
    }
  }
}
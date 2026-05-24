package dive.d90exception.eg90noexception;

class Person {

  String name;
  int age;

  void setName(String name) {
    if (name.length() < 3) {
      System.out.println("잘못된 이름입니다");
      return;
    }
    this.name = name;
  }

  void setAge(int age) {
    if (age < 18) {
      System.err.println("미성년자입니다");
      return;
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
    
    Person person = new Person();
    person.setName(name);
    person.setAge(age);
    
    if (person.name.length() < 3) {
      return;
    }

    if (person.age < 18) {
      return;
    }

    // 실행되면 안됨
    System.out.println("내 친구를 소개할게");
    System.out.println(person.toString());
  }
}
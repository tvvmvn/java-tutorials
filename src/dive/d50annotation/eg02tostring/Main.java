package dive.d50annotation.eg02tostring;

class Person {
  
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("Person{name=%s, age=%d}", name, age);
  }
}

public class Main {
  public static void main(String[] args) {
    Person person = new Person("John Doe", 30);

    System.out.println(person);
  }
}

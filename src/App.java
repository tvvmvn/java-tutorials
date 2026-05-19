class Person {
  
  String name;
  int age;

  Person() {}

  Person(String name, int age) {}
}

public class App {

  public static void main(String[] args) throws Exception {

    Person p1 = new Person();
    Person p2 = new Person("John Doe", 30);
  }
}

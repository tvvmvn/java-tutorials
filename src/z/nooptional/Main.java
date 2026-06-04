package z.nooptional;

class Address {
  String city;
  String details;

  Address(String city, String details) {
    this.city = city;
    this.details = details;
  }
}

class Person  {
  String name;
  Address address;

  Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }
}

public class Main {
  public static void main(String[] args) {

    Address address = new Address("Seoul", "xxx");
    Person person = new Person("John Doe", address);

    if (person != null) {
      if (person.address != null) {
        System.out.println(person.address.city);
      }
    }
  }
}
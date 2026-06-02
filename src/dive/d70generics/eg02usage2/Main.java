package dive.d70generics.eg02usage2;

class Car {

  String modelName;
  String color;
  int year;

  Car(String modelName, String color, int year) {
    this.modelName = modelName;
    this.color = color;
    this.year = year;
  }

  @Override
  public String toString() {
    return String.format("Car{modelName=%s, color=%s, year=%d}", modelName, color, year);
  }
}

// 💡 <T>를 붙여 데이터 타입을 외부에서 결정하도록 위임합니다.
class Person<T> {

  String name;
  int age;
  T numberOne;

  Person(String name, int age, T numberOne) {
    this.name = name;
    this.age = age;
    this.numberOne = numberOne;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  T getNumberOne() {
    return numberOne;
  } 
}

public class Main {
  public static void main(String[] args) {
    
    Car car = new Car("Avante", "Black", 2015);
    
    Person<Car> person = new Person<>("John Doe", 30, car);

    System.out.println("개인정보");
    System.out.println("이름: " + person.getName());
    System.out.println("나이: " + person.getAge());
    System.out.println("보물 1호: " + person.getNumberOne());
  }
}
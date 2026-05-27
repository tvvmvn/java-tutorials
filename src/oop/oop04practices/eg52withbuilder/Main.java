package oop.oop04practices.eg52withbuilder;

class Person {

  private String name;
  private String email;
  private String address;
  private int age;

  private Person(Builder builder) {
    this.name = builder.name;
    this.email = builder.email;
    this.address = builder.address;
    this.age = builder.age;
  }

  public static Builder builder() {
    return new Builder();
  }

  // 비즈니스 로직들
  public void eat() {
    System.out.println("밥 먹는중");
  }

  public void work() {
    System.out.println("일 하는중");
  }

  public void sleep() {
    System.out.println("잠자는 중");
  }

  @Override
  public String toString() {
    return String.format("Person{name=%s, email=%s, address=%s, age=%d}", name, email, address, age);
  }

  // 빌더: 객체가 복잡할 때 생성 과정을 내부의 빌더에게 위임합니다.
  public static class Builder {
    // 설정하지 않으면 기본값이 적용됩니다.
    private String name = "";
    private String email = "";
    private String address = "";
    private int age = 0;

    public Builder() {}

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      // this(빌더 인스턴스)를 바깥 클래스 생성자에게 전달
      return new Person(this);
    }
  }
}

public class Main {
  public static void main(String[] args) {

    // Full info
    Person john = Person.builder()
        .name("John Doe")
        .email("johndoe@example.com")
        .address("xxx")
        .age(30)
        .build();
    System.out.println(john);

    // 나이 없음
    Person jane = Person.builder()
        .name("Jane Doe")
        .email("janedoe@example.com")
        .address("xxx")
        .build();
    System.out.println(jane);

    // 나이, 주소 없음
    Person mary = Person.builder() 
        .name("Mary Doe")
        .email("marydoe@example.com")
        .build();
    System.out.println(mary);
  }
}
package oop.oop04practices.q00builder;

class Person {

  private final String name;
  private final String email;
  private final int age;

  private Person(Builder builder) {
    this.name = builder.name;
    this.email = builder.email;
    this.age = builder.age;
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getName() {return name;}
  public String getEmail() {return email;}
  public int getAge() {return age;}

  @Override
  public String toString() {
    return String.format("Person{name=%s, email=%s, age=%d}", name, email, age);
  }

  // 객체가 복잡할 때 생성 과정을 내부의 빌더에게 위임합니다.
  public static class Builder {
    private String name = "";
    private String email = "";
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
  
    public Builder age(int age) {
      this.age = age;
      return this;
    }
  
    public Person build() {
      // 빌더 객체를 바깥 클래스 생성자에게 전달
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
      .age(30)
      .build();

    System.out.println(john);

    // Hide age
    Person jane = Person.builder()
      .name("John Doe")
      .email("johndoe@example.com")
      .build();

    System.out.println(jane);
  }
}
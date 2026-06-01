package dive.d15anonymousclass.eg25withanonymous;

interface Person {
  void greeting();
}

public class Main {
  public static void main(String[] args) {

    Person korean = new Person() {
      public void greeting() {
        System.out.println("안녕하세요!");
      }
    };

    Person japanese = new Person() {
      public void greeting() {
        System.out.println("곤니치와!");
      }
    };

    korean.greeting();
    japanese.greeting();
  }
}
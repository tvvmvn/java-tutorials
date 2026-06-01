package dive.d15anonymousclass.eg01noanonymous;

interface Person {
  void greeting();
}

// * public class는 파일 하나당 하나만 가능! -> 클래스들을 파일별로 분리해야되 *

class Korean implements Person {
  public void greeting() {
    System.out.println("안녕하세요!");
  }
}

class Japanese implements Person {
  public void greeting() {
    System.out.println("곤니치와!");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person korean = new Korean();
    Person japanese = new Japanese();

    korean.greeting();
    japanese.greeting();
  }
}

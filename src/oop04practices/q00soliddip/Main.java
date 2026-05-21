package oop04practices.q00soliddip;

// Toy 인터페이스
interface Toy {
  String work();
}

// Toy 구현체
class Lego implements Toy {
  public String work() {
    return "레고 작동중";
  }
}

// Toy 구현체2
class Dinosaur implements Toy {
  public String work() {
    return "공룡 작동중";
  }
}

// 장난감을 가지고 노는 아이
class Kids {

  // 구체적인 개념(Lego)보다 추상적인 개념(Toy)에 의존합니다.
  Toy toy;

  Kids(Toy toy) {
    this.toy = toy;
  }

  void play() {
    System.out.println(toy.work());
  }
}

public class Main {
  public static void main(String[] args) {
    
    // 장난감이 바뀌어도 됨!
    Kids kids = new Kids(new Lego());

    kids.play();
  }
}

// 레고 작동중..
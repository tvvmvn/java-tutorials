package oop.oop04practice.eg83goodtemplatemethod2;

abstract class ChipRecipeTemplate {
  // 자식이 수정 못하도록 방어
  final void perform() {
    System.out.println("기름을 준비합니다");
    System.out.println("기름을 끓입니다.");

    runBusiness();

    System.out.println("튀긴 칩을 접시에 올려놓습니다");
    System.out.println("기름을 정리합니다");
    System.out.println("요리 끝!");
  }

  abstract void runBusiness();
}

class PotatoChipRecipe extends ChipRecipeTemplate {
  void runBusiness() {
    System.out.println("감자를 썰어서 기름에 넣어줍니다");
  }
}

class SweetPotatoChipRecipe extends ChipRecipeTemplate {
  void runBusiness() {
    System.out.println("고구마를 썰어서 기름에 넣어줍니다");
  }
}

class CornChipRecipe extends ChipRecipeTemplate {
  void runBusiness() {
    System.out.println("옥수수 반죽을 만듭니다");
    System.out.println("반죽을 적당한 크기로 잘라 기름에 넣어줍니다");
  }
}

public class Main {
  public static void main(String[] args) {
    
// 💡 포인트: 부모 타입의 배열을 선언하고 서로 다른 자식 인스턴스들을 한 번에 묶어 담습니다.
    ChipRecipeTemplate[] recipeArray = {
        new PotatoChipRecipe(),
        new SweetPotatoChipRecipe(),
        new CornChipRecipe()
    };

    // 향상된 for문을 사용하여 단 몇 줄로 일괄 처리 프로세스 완료
    for (ChipRecipeTemplate recipe : recipeArray) {
        recipe.perform(); // 각 객체의 오버라이딩된 템플릿 기능이 차례대로 수행됨
    }
  }
}
package oop.oop04practices.eg83goodtemplatemethod2;

abstract class ChipRecipeTemplate {
  // 자식이 수정 못하도록 방어
  final void execute() {
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
    
    ChipRecipeTemplate potatoChipRecipe = new PotatoChipRecipe();
    potatoChipRecipe.execute();

    ChipRecipeTemplate sweetPotatoChipRecipe = new SweetPotatoChipRecipe();
    sweetPotatoChipRecipe.execute();

    ChipRecipeTemplate cornChipRecipe = new CornChipRecipe();
    cornChipRecipe.execute();
  }
}
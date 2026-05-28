package oop.oop04practices.eg82notemplatemethod2;

class PotatoChipRecipe {
  void execute() {
    System.out.println("기름을 준비합니다");
    System.out.println("기름을 끓입니다.");

    System.out.println("감자를 썰어서 기름에 넣어줍니다");

    System.out.println("튀긴 칩을 접시에 올려놓습니다");
    System.out.println("기름을 정리합니다");
    System.out.println("요리 끝!");
  }
}

class SweetPotatoChipRecipe {
  void execute() {
    System.out.println("기름을 준비합니다");
    System.out.println("기름을 끓입니다.");

    System.out.println("고구마를 썰어서 기름에 넣어줍니다");

    System.out.println("튀긴 칩을 접시에 올려놓습니다");
    System.out.println("기름을 정리합니다");
    System.out.println("요리 끝!");
  }
}

class CornChipRecipe {
  void execute() {
    System.out.println("기름을 준비합니다");
    System.out.println("기름을 끓입니다.");

    System.out.println("옥수수 반죽을 만듭니다");
    System.out.println("반죽을 적당한 크기로 잘라 기름에 넣어줍니다");

    System.out.println("튀긴 칩을 접시에 올려놓습니다");
    System.out.println("기름을 정리합니다");
    System.out.println("요리 끝!");
  }
}

public class Main {
  public static void main(String[] args) {
    
    PotatoChipRecipe potatoChipRecipe = new PotatoChipRecipe();
    potatoChipRecipe.execute();

    SweetPotatoChipRecipe sweetPotatoChipRecipe = new SweetPotatoChipRecipe();
    sweetPotatoChipRecipe.execute();

    CornChipRecipe cornChipRecipe = new CornChipRecipe();
    cornChipRecipe.execute();
  }
}
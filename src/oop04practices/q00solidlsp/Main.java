package oop04practices.q00solidlsp;

// 부모
class Rectangle {
  int width, height;

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  int getArea() {
    return width * height;
  }
}

// 자식
class Square extends Rectangle {
  Square(int width, int height) {
    super(width, height);
  }
  
  // 부모의 메서드를 새롭게 정의합니다. (LSP 위반의 원인이 여기서 발생합니다)
  @Override
  int getArea() {
    return width * width;
  }
}

public class Main {
  public static void main(String[] args) {
    // 자식의 인스턴스
    Rectangle rect = new Square(10, 5);

    // 결과는 예상과 달리 50이 아니라 100이 나옵니다 (LSP 위반)
    System.out.println(rect.getArea());
  }  
}

//100
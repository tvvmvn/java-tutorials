package oop04practices.q00solidlsp;

// 부모
class Rectangle {

  int width;
  int height;

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
  
  // 부모의 메서드를 새롭게 정의합니다. (LSP 위반의 원인)
  @Override
  int getArea() {
    return width * width;
  }
}

public class Main {
  public static void main(String[] args) {
    // Square의 인스턴스
    Rectangle rectangle = new Square(10, 5);

    // LSP 위반
    System.out.println(rectangle.getArea());
  }  
}

//100
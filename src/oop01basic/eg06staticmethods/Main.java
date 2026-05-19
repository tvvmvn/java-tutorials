package oop01basic.eg06staticmethods;

class MathTeacher {

  static int sum(int a, int b) {
    return a + b;
  }

  static int multiply(int a, int b) {
    return a * b;
  }
}

public class Main {
  public static void main(String[] args) {

    System.out.println(MathTeacher.sum(1, 2));
    System.out.println(MathTeacher.multiply(1, 2));
  }  
}

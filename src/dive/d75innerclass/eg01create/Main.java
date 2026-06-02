package dive.d75innerclass.eg01create;

class Outer {

  int a = 1;

  class Inner1 {
    int b = 2;
  }

  static class Inner2 {
    int b = 2;
  }
}

public class Main {
  public static void main(String[] args) {

    // 
    Outer outer = new Outer();
    Outer.Inner1 inner1 = outer.new Inner1();

    // 바깥 객체없이 단독 생성 가능
    Outer.Inner2 inner2 =  new Outer.Inner2();

  }
}

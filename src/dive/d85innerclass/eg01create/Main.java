package dive.d85innerclass.eg01create;

class Outer {
  class InstanceInner {}
  static class StaticInner {}
}

public class Main {
  public static void main(String[] args) {

    // 바깥 클래스의 객체가 있어야 인스턴스 생성아 가능합니다.
    Outer outer = new Outer();
    Outer.InstanceInner normalInner = outer.new InstanceInner();

    // 바깥 클래스의 인스턴스없이 단독적으로 생성이 가능합니다.
    Outer.StaticInner staticInner =  new Outer.StaticInner();
  }
}

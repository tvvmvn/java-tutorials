package oop04practices.q00polymorphism;

interface Tool {
  void work();
}

class Knife implements Tool {
  public void work() {
    System.out.println("써는중");
  }
}

class Scissors implements Tool {
  public void work() {
    System.out.println("자르는중");
  }
}

class Hammer implements Tool {
  public void work() {
    System.out.println("못박는중");
  }
}

// + 새 도구 추가

public class Main {
  public static void main(String[] args) throws Exception {
    
    Tool tool = null;
    String req = "못박기";

    if ("썰기".equals(req)) {
      tool = new Knife();
    } else if ("자르기".equals(req)) {
      tool = new Scissors();
    } else if ("못박기".equals(req)) {
      tool = new Hammer();
    } else {
      System.out.println("알수없는 요청");
      return;
    }
    
    // 이번엔 못박는중.. (다형성)
    tool.work();
  }
}

package _lab.toolgood;

interface Tool {
  void use();
}

class Knife implements Tool {
  public void use() {
    System.out.println("써는중");
  }
}

class Scissors implements Tool {
  public void use() {
    System.out.println("자르는중");
  }
}

class Hammer implements Tool {
  public void use() {
    System.out.println("못박는중");
  }
}

// + 새 도구 추가

class Worker {
  Tool tool;

  Worker(Tool tool) {
    this.tool = tool;
  }

  void work() {
    tool.use();
  }
}

public class Main {
  public static void main(String[] args) throws Exception {
    
    String req = "못박기";
    Tool tool;

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
    
    Worker worker = new Worker(tool);
    worker.work();
  }
}

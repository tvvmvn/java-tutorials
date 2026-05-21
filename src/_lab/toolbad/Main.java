package _lab.toolbad;

class ToolBox {
  void getKnife() {
    System.out.println("써는중");
  }

  void getScissor() {
    System.out.println("자르는중");
  }

  void getHammer() {
    System.out.println("못박는중");
  }
  
  // + 새 도구 추가 (기존 클래스 수정해야 함)
}

class Worker {
  ToolBox toolBox;

  Worker(ToolBox toolBox) {
    this.toolBox = toolBox;
  }
  
  void work(String req) {
    if ("썰기".equals(req)) {
      toolBox.getKnife();
    } else if ("자르기".equals(req)) {
      toolBox.getScissor();
    } else if ("못박기".equals(req)) {
      toolBox.getHammer();
    } else {
      System.out.println("알수없는 요청");
      return;
    }
  }
}

public class Main {

  public static void main(String[] args) throws Exception {
    
    ToolBox toolBox = new ToolBox();
    Worker worker = new Worker(toolBox);
    worker.work("못박기");
  }
}

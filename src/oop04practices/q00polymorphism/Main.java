package oop04practices.q00polymorphism;

// polymorphism + OCP

class Tools {
  void work() {
    System.out.println("working");
  }
}

class Knife extends Tools {
  void work() {
    System.out.println("slicing");
  }
}

class Scissors extends Tools {
  void work() {
    System.out.println("cutting");
  }
}

class Hammer extends Tools {
  void work() {
    System.out.println("nailing");
  }
}

public class Main {
  public static void main(String[] args) throws Exception {
    
    Tools myTool = null;
    String req = "cutting";

    switch (req) {
      case "slicing":
        myTool = new Knife();
        break;
      case "cutting":
        myTool = new Scissors();
        break;
      case "nailing":
        myTool = new Hammer();
        break;
    }

    if (myTool != null) {
      myTool.work();
    }
  }
}

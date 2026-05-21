package oop03abstraction.eg04interfaceimplements2;

interface Transport {
  void carry();
}

class Bus implements Transport {
  public void carry() { 
    System.out.println("부릉부릉");
  }
}

class Train implements Transport {
  public void carry() {
    System.out.println("칙칙폭폭");
  }
}

class Airplane implements Transport {
  public void carry() {
    System.out.println("슈웅");
  }
}

public class Main {
  public static void main(String[] args) {

    Transport bus = new Bus();
    Transport train = new Train();
    Transport airplane = new Airplane();

    bus.carry();
    train.carry();
    airplane.carry();
  }
}
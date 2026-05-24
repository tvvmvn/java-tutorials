package oop.oop03abstraction.eg04interfaceimplements2;

interface Chessman {
  void move();
}

class Queen implements Chessman {
  public void move() { 
    System.out.println("모든 곳으로 이동!");
  }
}

class Knight implements Chessman {
  public void move() {
    System.out.println("직선으로 이동!");
  }
}

class Bishop implements Chessman {
  public void move() {
    System.out.println("대각선으로 이동!");
  }
}

public class Main {
  public static void main(String[] args) {

    Chessman queen = new Queen();
    Chessman knight = new Knight();
    Chessman bishop = new Bishop();

    queen.move();
    knight.move();
    bishop.move();
  }
}
package dive.d65enum.eg01create2;

enum OrderStatus { READY, SHIPPING, DELIVERED }

public class Main {
  public static void main(String[] args) {

    System.out.println(OrderStatus.READY);
    System.out.println(OrderStatus.SHIPPING);
    System.out.println(OrderStatus.DELIVERED);
  }
}

package dive.d65enum.eg02usage2;

enum OrderStatus { READY, SHIPPING, DELIVERED }

public class Main {
  public static void main(String[] args) {

    OrderStatus myOrder = OrderStatus.SHIPPING;

    switch (myOrder) {
      case OrderStatus.READY:
        System.out.println("배송 준비중");
        break;
      case OrderStatus.SHIPPING:
        System.out.println("배송중");
        break;
      case OrderStatus.DELIVERED:
        System.out.println("배송 완료");
        break;
    }

  }
}

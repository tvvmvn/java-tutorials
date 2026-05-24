package oop05designpatterns.t01creational.eg02factorymethod;

// Product
interface Delivery {
  void move();
}

// ConcreteProduct A
class FootDelivery implements Delivery {
  @Override
  public void move() {
    System.out.println("걸어서 배달합니다. 🏃");
  }
}

// ConcreteProduct B
class MotorcycleDelivery implements Delivery {
  @Override
  public void move() {
    System.out.println("오토바이로 질주합니다. 🏍️");
  }
}

// Creator
abstract class DeliveryFactory {
  // 객체 생성을 외부(하위 클래스)에 위임하는 [팩토리 메서드]
  abstract protected Delivery createDelivery();

  // 팩토리 메서드로 만든 객체를 가지고 비즈니스 로직을 수행하는 공통 메서드
  public void manageDelivery() {
    Delivery delivery = createDelivery(); // 어떤 객체인지는 몰라도 인터페이스로 제어 가능
    delivery.move();
  }
}

// ConcreteCreator A
class FootDeliveryFactory extends DeliveryFactory {
  @Override
  protected Delivery createDelivery() {
    return new FootDelivery(); // 도보 배달 객체 생성
  }
}

// ConcreteCreator B
class MotorcycleDeliveryFactory extends DeliveryFactory {
  @Override
  protected Delivery createDelivery() {
    return new MotorcycleDelivery(); // 오토바이 배달 객체 생성
  }
}

public class Main {
  public static void main(String[] args) {
    // 1. 도보 배달이 필요할 때
    DeliveryFactory footFactory = new FootDeliveryFactory();
    footFactory.manageDelivery(); // 출력: 걸어서 배달합니다. 🏃

    // 2. 오토바이 배달이 필요할 때
    DeliveryFactory motoFactory = new MotorcycleDeliveryFactory();
    motoFactory.manageDelivery(); // 출력: 오토바이로 질주합니다. 🏍️
  }
}
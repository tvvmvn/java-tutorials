package oop05designpatterns.t02structural.eg00state;

// Context
class OrderContext {
  private OrderState currentState;

  public OrderContext() {
    this.currentState = new OrderedState(); // 초기 상태: 접수
  }

  public void setState(OrderState state) {
    this.currentState = state;
  }

  // 행동 위임
  public void nextStep() {
    currentState.next(this);
  }

  public void cancelOrder() {
    currentState.cancel(this);
  }
}

// State 인터페이스
interface OrderState {
  void next(OrderContext context);

  void cancel(OrderContext context);
}

// 1. 접수 상태
class OrderedState implements OrderState {
  @Override
  public void next(OrderContext context) {
    System.out.println("배송을 시작합니다.");
    context.setState(new DeliveryState()); // 다음 상태로 전환
  }

  @Override
  public void cancel(OrderContext context) {
    System.out.println("주문을 취소합니다.");
    // 취소 상태로 변경 로직...
  }
}

// 2. 배송중 상태
class DeliveryState implements OrderState {
  @Override
  public void next(OrderContext context) {
    System.out.println("배송이 완료되었습니다.");
    context.setState(new CompleteState());
  }

  @Override
  public void cancel(OrderContext context) {
    System.out.println("❌ 에러: 이미 배송 중인 상품은 취소할 수 없습니다.");
  }
}

// 3. 완료 상태
class CompleteState implements OrderState {
  @Override
  public void next(OrderContext context) {
    System.out.println("최종 완료된 주문입니다. 더 이상 다음 단계가 없습니다.");
  }

  @Override
  public void cancel(OrderContext context) {
    System.out.println("❌ 에러: 완료된 주문은 취소할 수 없습니다.");
  }
}

public class Main {
  public static void main(String[] args) {
    OrderContext order = new OrderContext(); // 처음엔 OrderedState

    // 1. 접수 상태에서 다음 단계로
    order.nextStep(); // 출력: 배송을 시작합니다. (내부적으로 DeliveryState로 전이)

    // 2. 배송중 상태에서 취소 시도
    order.cancelOrder(); // 출력: ❌ 에러: 이미 배송 중인 상품은 취소할 수 없습니다.

    // 3. 배송중에서 완료 단계로
    order.nextStep(); // 출력: 배송이 완료되었습니다. (CompleteState로 전이)

    // 4. 완료 상태에서 취소 시도
    order.cancelOrder(); // 출력: ❌ 에러: 완료된 주문은 취소할 수 없습니다.
  }
}
package dive01basic.d22anonymousclass.eg01noanonymous;

interface ButtonClickListener {
  void onClick();
}

// 1. 인터페이스를 구현하는 별도의 클래스를 만듦
class AlarmTrigger implements ButtonClickListener {
  @Override
  public void onClick() {
    System.out.println("알람이 울립니다!");
  }
}

public class Main {
  public static void main(String[] args) {
    // 2. 객체를 생성해서 사용
    ButtonClickListener listener = new AlarmTrigger();
    listener.onClick();
  }
}

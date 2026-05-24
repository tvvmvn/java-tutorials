package dive01basic.d22anonymousclass.eg25withanonymous;

interface ButtonClickListener {
  void onClick();
}

public class Main {
  public static void main(String[] args) {
    // 클래스 정의와 객체 생성을 한 번에 처리
    ButtonClickListener listener = new ButtonClickListener() {
      @Override
      public void onClick() {
        System.out.println("알람이 울립니다!");
      }
    };

    listener.onClick();
  }
}
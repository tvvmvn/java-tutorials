package dive.d80lambda.eg28create2;

interface ButtonClickListener {
  void onClick();
}

public class Main {
  public static void main(String[] args) {
    
    // 제곱을 수행하는 함수를 빠르게 정의하고파
    ButtonClickListener listener = () -> System.out.println(".");

    // 람다 호출
    listener.onClick();
    listener.onClick();
    listener.onClick();
  }  
}

// 144
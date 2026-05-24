package dive.d10wrapperclass.eg01basic;

public class Main {
  public static void main(String[] args) {

    int n = 848390245;
    
    // 정수형 래퍼클래스
    Integer randomNum = Integer.valueOf(n);
    System.out.println("숫자 개수: " + randomNum.toString().length());

    // 돌려놓기
    int result = randomNum.intValue();
    System.out.println(result);
  }
}

// 숫자 개수: 9
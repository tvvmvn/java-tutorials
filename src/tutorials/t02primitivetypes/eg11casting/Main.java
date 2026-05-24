package tutorials.t02primitivetypes.eg11casting;

public class Main {
  public static void main(String[] args) {
    
    double weight = 50.25;

    // weight를 50으로 캐스팅하고 새로운 변수에 저장합니다
    int truncatedWeight = (int) weight;

    System.out.println(truncatedWeight);
  }
}

// 50
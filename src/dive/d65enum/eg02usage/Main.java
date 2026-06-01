package dive.d65enum.eg02usage;

enum Day { SUN, MON, TUE, WED, THU, FRI, SAT }

public class Main {
  public static void main(String[] args) {

    Day today = Day.FRI;

    switch (today) {
      case Day.SUN:
        System.out.println("일요일입니다");
        break;
      case Day.MON:
        System.out.println("월요일입니다");
        break;
      case Day.TUE:
        System.out.println("화요일입니다");
        break;
      case Day.WED:
        System.out.println("수요일입니다");
        break;
      case Day.THU:
        System.out.println("목요일입니다");
        break;
      case Day.FRI:
        System.out.println("금요일입니다");
        break;
      case Day.SAT:
        System.out.println("토요일입니다");
        break;
    }
  }
}


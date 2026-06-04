import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    Optional<String> opt = Optional.ofNullable("Hype Boy");

// 💡 상자 안에 노래 제목이 들어있을 때만 콘솔에 출력해라! (null이면 아무 일도 안 일어남)
opt.ifPresent(song -> System.out.println("현재 재생 중: " + song));
  }
}
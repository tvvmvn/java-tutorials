package projects1.playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PlayList {

  private List<String> songs = new ArrayList<>();

  public PlayList() {}

  public void addSong(String name) {
    songs.add(name);
  }

  public void removeSong(int num) {
    int index = num - 1;
    if (index < 0 || index > songs.size() - 1) {
      System.out.println("존재하지 않는 노래입니다");
      return;
    }

    songs.remove(index);
  }

  public void listSongs() {
    for (int i = 0; i < songs.size(); i++) {
      System.out.println((i + 1) + ". " + songs.get(i));
    }
  }
}

class App {

  private PlayList playList = new PlayList();

  public App() {
    playList.addSong("foo");
    playList.addSong("bar");
    playList.addSong("baz");
  }

  public void play() {

    Scanner scanner = new Scanner(System.in);
    String userInput;

    while (true) {
      // UI
      System.out.println();
      System.out.println("===============================================");
      System.out.println("플레이리스트 앱 🎵");
      playList.listSongs();
      System.out.println();
      System.out.println("추가: add + 노래 | 삭제: drop + 노래 번호 | 종료: end");
      System.out.println("===============================================");
      
      // User input
      System.out.print("▶ ");
      userInput = scanner.nextLine().trim();
      
      String[] parsedInput = userInput.split(" ", 2);
      String command = parsedInput[0];

      if ("end".equals(command)) {
        System.out.println("잘가");
        break;
      } else if ("add".equals(command)) {
        String newSong = parsedInput[1];

        if (parsedInput.length < 2 || newSong.isBlank()) {
          System.out.println("노래 제목을 적으세요");
        } else {
          playList.addSong(parsedInput[1]);
        }
      } else if ("drop".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("삭제할 번호를 선택하세요");
          continue;
        }
        
        try {
          int number = Integer.parseInt(parsedInput[1]);
  
          playList.removeSong(number);
        } catch (NumberFormatException e) {
          System.out.println("유효한 숫자를 입력하세요");
        }
      } else {
        System.out.println("잘못된 명령");
      }
    }

    // 
    scanner.close();
  }
}

public class Main {
  public static void main(String[] args) {
    App app = new App();
    app.play();
  }
}
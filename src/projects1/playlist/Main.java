package projects1.playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PlayList {

  List<String> songs = new ArrayList<>();

  void addSong(String name) {
    songs.add(name);
  }

  void removeSong(String num) {
    int index = Integer.parseInt(num) - 1;
    songs.remove(index);
  }

  void listSongs() {
    int i = 1;
    for (String song : songs) {
      System.out.println((i++) + ". " + song);
    }
  }
}

class App {

  PlayList playList = new PlayList();

  App() {
    playList.addSong("foo");
    playList.addSong("bar");
    playList.addSong("baz");
  }

  void play() {
    Scanner scanner = new Scanner(System.in);
    String command;

    while (true) {
      System.out.println("\n플레이리스트 앱!");
      playList.listSongs();
      System.out.println("추가: add + 노래");
      System.out.println("삭제: drop + 노래 번호");
      System.out.println("종료: bye");
      System.out.print(">>>");

      command = scanner.nextLine();

      if ("bye".equals(command)) {
        System.out.println("잘가");
        scanner.close();
        return;
      }

      String[] arr = command.split(" ", 2);

      if (arr.length < 2) {
        System.out.println("잘못된 명령");
        scanner.close();
        return;
      }

      if ("add".equals(arr[0])) {
        playList.addSong(arr[1]);
      } else if ("drop".equals(arr[0])) {
        playList.removeSong(arr[1]);
      } else {
        System.out.println("잘못된 명령");
        scanner.close();
        return;
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    App app = new App();
    app.play();
  }
}
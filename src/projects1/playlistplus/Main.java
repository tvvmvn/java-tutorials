package projects1.playlistplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// DAO
class PlayList {

  private List<String> songs = new ArrayList<>();

  public PlayList() {
    addSong("Lately - Stevie Wonder");
    addSong("Ordinary People - John Legend");
    addSong("Man In The Mirror - Michael Jackson");
  }

  public List<String> getAllSongs() {
    return songs;
  }

  public String getSongByNumber(int number) {
    int index = number - 1;
    if (index < 0 || index > songs.size() - 1) {
      throw new IllegalArgumentException("곡을 찾을 수 없습니다");
    }
    return songs.get(index);
  }

  public void addSong(String name) {
    songs.add(name);
  }

  public void removeSong(int number) {
    int index = number - 1;
    if (index < 0 || index > songs.size() - 1) {
      throw new IllegalArgumentException("곡을 찾을 수 없습니다");
    }
    songs.remove(index);
  }
}

class View {
  void printList(List<String> songs) {
    System.out.println("------------------------");
    System.out.println("<플레이리스트 앱 🎵>");
    for (int i = 0; i < songs.size(); i++) {
      System.out.println((i + 1) + ". " + songs.get(i));
    }
    System.out.println();
    System.out.println("추가: add + 노래 | 삭제: drop + 번호 | 재생: play + 번호");
    System.out.println("종료: end");
  }

  void printPlay(String song) {
    System.out.println("------------------------");
    System.out.println("<플레이리스트 앱 🎵>");
    System.out.println();
    System.out.println("🎵" + song);
    System.out.println("돌아가기: list | 종료: end");
  }
}

class Controller {

  private View view = new View();
  private PlayList playList = new PlayList();

  public Controller() {}

  //GET
  void listSongs() {
    List<String> songs = playList.getAllSongs();
    view.printList(songs);
  }

  //GET
  void playSong(String numString) {
    try {
      int number = Integer.parseInt(numString);
      String song = playList.getSongByNumber(number);
      view.printPlay(song);
    } catch (IllegalArgumentException e) {
      System.out.println("Ex: " + e.getMessage());
    }
  }

  //POST
  void addSong(String newSong) {
    playList.addSong(newSong);
    List<String> songs = playList.getAllSongs();
    view.printList(songs);
  }

  //POST
  void dropSong(String numString) {
    try {
      int number = Integer.parseInt(numString);
      playList.removeSong(number);
    } catch (IllegalArgumentException e) {
      System.out.println("Ex: " + e.getMessage());
    }

    List<String> songs = playList.getAllSongs();
    view.printList(songs);
  }
}


class CommandHandler {

  Scanner scanner = new Scanner(System.in);
  Controller controller;

  public CommandHandler(Controller controller) {
    this.controller = controller;
  }

  public void run() {
    controller.listSongs();
    while (true) {
      System.out.print("> ");
      String userInput = scanner.nextLine().trim();
      String[] parsedInput = userInput.split(" ", 2);
      String command = parsedInput[0];

      // Handling commands
      if ("list".equals(command)) {
        controller.listSongs();
      } else if ("add".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("추가할 곡의 제목을 입력하세요");
          continue;
        }
        controller.addSong(parsedInput[1]);
      } else if ("drop".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("삭제할 곡의 번호를 입력하세요");
          continue;
        }
        controller.dropSong(parsedInput[1]);
      } else if ("play".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("재생할 곡의 번호를 입력하세요");
          continue;
        }
        controller.playSong(parsedInput[1]);
      } else if ("end".equals(command)) {
        System.out.println("잘가");
        break;
      } else {
        System.out.println("잘못된 명령");
      }
    }

    scanner.close();
  }
}

public class Main {
  public static void main(String[] args) {
    Controller controller = new Controller();
    CommandHandler commandHandler = new CommandHandler(controller);
    commandHandler.run();
  }
}
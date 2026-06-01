package oop.oop05easypractices.eg00fillingarrays;

class PlayList {
  
  String name;
  String[] songs = new String[4];
  int count = 0;

  PlayList(String name) {
    this.name = name;
  }

  // 노래 추가하기
  void addSong(String song) {
    songs[count++] = song;
    System.out.println(song + "을 추가했습니다");
  }

  // 목록보기
  void listSongs() {
    System.out.println(name + " 플레이리스트:");
    for (String song : songs) {
      System.out.println(song);
    }
  } 
}

public class Main {
  public static void main(String[] args) {

    PlayList myPlaylist = new PlayList("마이클잭슨 모음집");
    
    // 추가하기
    myPlaylist.addSong("Billie Jeans - Michael Jacksons");
    myPlaylist.addSong("Beat It - Micheal Jacksons");
    myPlaylist.addSong("Black or White - Micheal Jacksons");
    myPlaylist.addSong("Heal The World  - Micheal Jacksons");

    // 목록보기
    myPlaylist.listSongs();
  }
}

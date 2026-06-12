package moreandeasy.eg60playlist;

import java.util.ArrayList;
import java.util.List;

class Playlist {
  
  private List<String> songs = new ArrayList<>();
  
  public Playlist() {}

  public List<String> getAllSongs() {
    return songs;
  }

  public String getSongByNumber(int number) {
    int index = number - 1;
    if (index < 0 || index >= songs.size()) {
      throw new IllegalArgumentException("노래를 찾을 수 없습니다");
    }
    return songs.get(index);
  }

  public void addSong(String song) {
    songs.add(song);
  }

  public void removeSong(int number) {
    int index = number - 1;
    if (index < 0 || index >= songs.size()) {
      throw new IllegalArgumentException("노래를 찾을 수 없습니다");
    }
    songs.remove(index);
  }
}

public class Main {
  public static void main(String[] args) {

    Playlist playlist = new Playlist();
    playlist.addSong("1. Lately - Stevie Wonder");
    playlist.addSong("2. Ordinary People - John Legend");
    playlist.addSong("3. Man In The Mirror - Michael Jackson");

    System.out.println(playlist.getAllSongs());

    System.out.println(playlist.getSongByNumber(1));

    playlist.removeSong(3);

    System.out.println(playlist.getAllSongs());

  }
}

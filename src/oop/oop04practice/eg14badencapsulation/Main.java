package oop.oop04practice.eg14badencapsulation;

class MapService {

  int lat; // 위도
  int lng; // 경도

  public MapService(int lat, int lng) {
    this.lat = lat;
    this.lng = lng;
  }

  int getLat() {
    return lat;
  }

  int getLng() {
    return lng;
  }
}

public class Main {
  public static void main(String[] args) {
    
    MapService map = new MapService(100, 200);

    int lat = map.getLat();
    int lng = map.getLng();

    // 나쁜점: 외부에서 장소 추천로직을 실행합니다.
    System.out.printf("Places based on [%d, %d]:", lat, lng);
  }
}

// Places based on [100, 200]:%
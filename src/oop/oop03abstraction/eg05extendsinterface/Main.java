package oop.oop03abstraction.eg05extendsinterface;

// 부모 인터페이스
interface YouTube {
  void playVideo();
}

// 자식 인터페이스
interface YouTubePremium extends YouTube {
  void removeAds();
}

public class Main {
  public static void main(String[] args) {

  }
}

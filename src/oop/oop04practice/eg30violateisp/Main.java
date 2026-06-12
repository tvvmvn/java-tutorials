package oop.oop04practice.eg30violateisp;

// 인터페이스
interface MFD {
  void print();
  void scan();
  void fax();
}

// 구현 클래스
class Printer implements MFD {
  public void print() {
    System.out.println("프린트중");
  }

  // 불필요하게 추상 메서드를 구현해야 합니다
  public void scan() {
    System.out.println("지원하지 않는 기능");
  }

  public void fax() {
    System.out.println("지원하지 않는 기능");
  }
}

class Scanner implements MFD {
  public void print() {
    System.out.println("지원하지 않는 기능");
  }

  public void scan() {
    System.out.println("스캔중");
  }

  public void fax() {
    System.out.println("지원하지 않는 기능");
  }
}

class Fax implements MFD {
  public void print() {
    System.out.println("지원하지 않는 기능");
  }

  public void scan() {
    System.out.println("지원하지 않는 기능");
  }

  public void fax() {
    System.out.println("팩스 보내는 중");
  }
}

// 클라이언트
class Company {
  MFD printer;

  Company(MFD printer) {
    this.printer = printer;
  }

  // 프린터만 쓰는 회사
  void work() {
    System.out.println("문서 작성중");
    System.out.println("이제 인쇄해야지");

    printer.print();
    printer.scan(); // 막을 방법이 없음
    printer.fax(); // 막을 방법이 없음

    System.out.println("업무 끝!");
  }
}

public class Main {
  public static void main(String[] args) {
    Company company = new Company(new Printer());
    company.work();
  }
}
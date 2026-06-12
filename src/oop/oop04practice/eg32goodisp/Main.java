package oop.oop04practice.eg32goodisp;

// 인터페이스
interface Printer {
  void print();
}

interface Scanner {
  void scan();
}

interface Fax {
  void fax();
}

// 구현 클래스
class TestPrinter implements Printer {
  public void print() {
    System.out.println("프린트중");
  }
}

class TestScanner implements Scanner {
  public void scan() {
    System.out.println("스캔중");
  }
}

class TestFax implements Fax {
  public void fax() {
    System.out.println("팩스 보내는 중");
  }
}

// 클라이언트
class Company {
  Printer printer;

  Company(Printer printer) {
    this.printer = printer;
  }

  void work() {
    System.out.println("문서 작성중");
    System.out.println("이제 인쇄해야지");
    printer.print();
    System.out.println("업무 끝!");
  }
}


public class Main {
  public static void main(String[] args) {
    Company company = new Company(new TestPrinter());

    company.work();
  }
}
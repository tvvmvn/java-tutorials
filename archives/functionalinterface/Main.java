package oop04practices.functionalinterface;

@FunctionalInterface
interface Printer {
  void print(int d);
}

public class Main {
  public static void main(String[] args) {

    Printer printer = (d) -> System.out.println(d);

    printer.print(1);
  }
}


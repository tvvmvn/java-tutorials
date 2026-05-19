package oop04practices.multiplecatch;

public class Main {
  public static void main(String[] args) {
    int a = 5, b = 0;

    try {
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.out.println("산술 예외");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열 범위 예외");
    } catch (NumberFormatException e) {
      System.out.println("숫자 서식 예외");
    } catch (Exception e) {
      System.out.println("기타 예외");
    } 
  }
}

// 산술 예외
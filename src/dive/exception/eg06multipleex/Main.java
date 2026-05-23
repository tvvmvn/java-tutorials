package dive.exception.eg06multipleex;

public class Main {
  public static void main(String[] args) {
    
    int[] arr = {10, 20, 30, 40};
    int index = 3;
    int divisor = 2;

    try {

      int item = arr[index];

      System.out.println(item / divisor);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e);
    } catch (ArithmeticException e) {
      System.err.println(e);
    } catch (Exception e) {
      System.err.println(e);
    }

  }
}
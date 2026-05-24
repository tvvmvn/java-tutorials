package tutorials.t08forloop.eg07foreach;

public class Main {
  public static void main(String[] args) {

    String[] persons = {"John Doe", "Jane Doe", "Mary Doe"};

    for (String person : persons) {
      System.out.println(person);
    }
  }
}

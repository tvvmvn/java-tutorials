package tutorials.t10practices.lv01startsWith;

public class Main {
  public static void main(String[] args) {
    
    String[] persons = {"John Doe", "Jane Doe", "Mary Doe", "Steve Jobs"};

    for (String person : persons) {
      if (person.charAt(0) == 'J') {
        System.out.println(person);
      }
    }
  }
}

package dive.d80lambda.eg28create2;

interface Animal {
  void cry();
}

public class Main {
  public static void main(String[] args) {
    
    Animal dog = () -> System.out.println("멍멍");
    dog.cry();
    
    Animal cat = () -> System.out.println("야옹");
    cat.cry();
  }  
}
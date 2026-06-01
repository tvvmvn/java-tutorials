package dive.d15anonymousclass.eg25withanonymous2;

interface Pet {
  void cry();
}

public class Main {
  public static void main(String[] args) {
    
    Pet dog = new Pet() {
      public void cry() {
        System.out.println("멍멍");
      }
    };
    
    Pet cat = new Pet() {
      public void cry() {
        System.out.println("야옹");
      }
    };

    dog.cry();
    cat.cry();
  }  
}
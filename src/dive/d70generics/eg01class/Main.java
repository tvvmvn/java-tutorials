package dive.d70generics.eg01class;

class Box<T> {

  T content;

  Box(T content) {
    this.content = content;
  }

  T getContent() {
    return this.content;
  }
}

public class Main {
  public static void main(String[] args) {

    Box<String> stringBox = new Box<>("hello");
    System.out.println("내용물: " + stringBox.getContent());
    
    Box<Integer> numberBox = new Box<>(999);
    System.out.println("내용물: " + numberBox.getContent());
    
    Box<Boolean> boolBox = new Box<>(true);
    System.out.println("내용물: " + boolBox.getContent());
  }
}

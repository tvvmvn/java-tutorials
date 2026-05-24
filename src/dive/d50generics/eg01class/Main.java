package dive.d50generics.eg01class;

// 바꿀 필요 없다
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
    System.out.println(stringBox.getContent());


  }
}

// 10
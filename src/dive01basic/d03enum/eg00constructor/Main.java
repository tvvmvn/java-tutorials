package dive01basic.d03enum.eg00constructor;

enum Grade {
  A("Best"),
  B("Excellent"),
  C("Great"),
  D("Good");

  private String description;

  Grade(String description) {
    this.description = description;
  }

  String getDescription() {
    return description;
  }
}

public class Main {
  public static void main(String[] args) {
    Grade myGrade = Grade.A;

    System.out.println(myGrade);
    System.out.println(myGrade.getDescription());
  }
}

// go to right
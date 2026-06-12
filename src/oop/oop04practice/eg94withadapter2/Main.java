package oop.oop04practice.eg94withadapter2;

interface ChargerStandard220V {
  void connect220V();//220V socket
}

class Charger220V implements ChargerStandard220V {
  public void connect220V() {
    System.out.println("220V 소켓에 연결되었습니다");
  }
}

class Charger110V {
  public void connect110V() {
    System.out.println("110V 소켓에 연결되었습니다");
  }
}

class Adapter implements ChargerStandard220V {
  Charger110V charger110V;

  Adapter(Charger110V charger110V) {
    this.charger110V = charger110V;
    System.out.println("220V 어답터가 연결되었습니다");
  }

  public void connect220V() {
    charger110V.connect110V();
  }
}

class Person {

  ChargerStandard220V chargerStandard220V;

  Person(ChargerStandard220V chargerStandard220V) {
    this.chargerStandard220V = chargerStandard220V;
  }

  void charge() {
    System.out.println("충전해야지");

    chargerStandard220V.connect220V();

    System.out.println("충전중!\n");
  }
}

public class Main {
  public static void main(String[] args) {

    String chargerToUse = "charger-110V";
    ChargerStandard220V chargerStandard220V;

    if ("charger-220V".equals(chargerToUse)) {
      chargerStandard220V = new Charger220V();
    } else if ("charger-110V".equals(chargerToUse)) {
      chargerStandard220V = new Adapter(new Charger110V());
    } else {
      System.out.println("알 수 없는 규격");
      return;
    }

    Person person = new Person(chargerStandard220V);
    person.charge();
  }
}
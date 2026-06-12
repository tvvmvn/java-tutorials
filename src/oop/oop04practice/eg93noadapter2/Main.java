package oop.oop04practice.eg93noadapter2;

interface ChargerStandard220V {
  void connect220V();//220v socket
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

class Person {

  ChargerStandard220V chargerStandard220V;
  Charger110V charger110V;

  Person(ChargerStandard220V chargerStandard220V, Charger110V charger110V) {
    this.chargerStandard220V = chargerStandard220V;
    this.charger110V = charger110V;
  }

  void charge(String chargerToUse) {
    System.out.println("충전해야지");

    if ("charger-220V".equals(chargerToUse)) {
      chargerStandard220V.connect220V();
    } else if ("charger-110V".equals(chargerToUse)) {
      System.out.println("110V용 소켓이 없습니다");
      return;
    } else {
      System.out.println("알 수 없는 규격");
      return;
    }

    System.out.println("충전중!\n");
  }
}

public class Main {
  public static void main(String[] args) {

    ChargerStandard220V chargerStandard220V = new Charger220V();
    Charger110V charger110V = new Charger110V();
    Person person = new Person(chargerStandard220V, charger110V);

    person.charge("charger-220V");
    person.charge("charger-110V");
  }
}
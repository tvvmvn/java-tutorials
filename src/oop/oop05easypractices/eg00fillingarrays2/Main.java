package oop.oop05easypractices.eg00fillingarrays2;

class DevTeam {
  
  String name;
  String[] members = new String[10];
  int memberCount = 0;

  DevTeam(String name) {
    this.name = name;
  }

  void addMember(String name) {
    if (memberCount == 10) {
      System.out.println("full!");
      return;
    }
    memberCount += 1;
  }
}

public class Main {
  public static void main(String[] args) {
    DevTeam team = new DevTeam("");
    
    team.addMember("John Doe");
    team.addMember("Jane Doe");
    team.addMember("Mary Doe");

    System.out.println(team.memberCount);
  }
}

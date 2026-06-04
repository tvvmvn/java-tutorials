package collections.c99practices.eg00userroles;

import java.util.HashSet;
import java.util.Set;

enum Roles { ROLE_ADMIN, ROLE_MANAGER, ROLE_USER }

public class Main {
  public static void main(String[] args) {
    
    Set<Roles> roles = new HashSet<>();
    
    roles.add(Roles.ROLE_MANAGER);
    roles.add(Roles.ROLE_USER);
    roles.add(Roles.ROLE_USER);

    System.out.println(roles);
  }
}

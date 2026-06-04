import java.util.HashSet;
import java.util.Set;

enum Roles { ADMIN, STAFF, USER };

public class Test {
  public static void main(String[] args) {
    
    Set<Roles> roles = new HashSet<>();
    roles.add(Roles.STAFF);
    roles.add(Roles.USER);

    System.out.println(roles);
  }
}

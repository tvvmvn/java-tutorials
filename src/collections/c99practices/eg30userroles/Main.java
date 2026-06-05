package collections.c99practices.eg30userroles;

import java.util.HashSet;
import java.util.Set;

enum Roles { ROLE_ADMIN, ROLE_STAFF, ROLE_USER }

public class Main {
  public static void main(String[] args) {
    
    // 설계적으로 중복을 막을 수 있어. 개발은 나 혼자 하는게 아니거든
    // 권한 간에 순서가 없다는 걸 표현할 수도 있지
    // 빠른 속도는 덤!
    Set<Roles> myRoles = new HashSet<>();
    
    myRoles.add(Roles.ROLE_STAFF);
    myRoles.add(Roles.ROLE_STAFF);
    myRoles.add(Roles.ROLE_USER);
    myRoles.add(Roles.ROLE_USER);

    System.out.println(myRoles);
  }
}

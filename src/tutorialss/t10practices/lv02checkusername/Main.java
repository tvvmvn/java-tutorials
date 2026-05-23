package tutorialss.t10practices.lv02checkusername;

public class Main {
  
public static boolean isValidUsername(String username) {

  String pattern = "^[a-z0-9_.]{5,20}$";

  return username.matches(pattern);
}

public static void main(String[] args) throws Exception {
  System.out.println(isValidUsername("user123")); 
  System.out.println(isValidUsername("User123")); 
  System.out.println(isValidUsername("user_123")); 
  System.out.println(isValidUsername("user.123")); 
  }
}

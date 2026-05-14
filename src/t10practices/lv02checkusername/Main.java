package t10practices.lv02checkusername;

public class Main {
  
public static boolean isValidId(String id) {
  if (id == null)
    return false;

  // 정규표현식 설명:
  // ^[a-z] : 반드시 영문 소문자로 시작
  // [a-z0-9]{4,19} : 이후 소문자나 숫자가 4~19자 더 옴 (총 5~20자)
  // $ : 문자열의 끝
  String idPattern = "^[a-z0-9_.]{5,20}$";

  return id.matches(idPattern);
}

public static void main(String[] args) throws Exception {
  System.out.println(isValidId("user123")); 
  System.out.println(isValidId("User123")); 
  System.out.println(isValidId("user_123")); 
  System.out.println(isValidId("user.123")); 
  }
}

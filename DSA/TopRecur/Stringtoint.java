import java.util.*;

public class Stringtoint{
  public static int solve(String str){
    if(str.length() == 0){
      return 0;
    }
    int y = str.charAt(0) -'0';
    
    int value = (int)Math.pow(10,str.length()-1) * y;
    
    return value + solve(str.substring(1));
  }
  public static void main(String[] args){
    String str = "12345";
    System.out.println(solve(str));
  }
}

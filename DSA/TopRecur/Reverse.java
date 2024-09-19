import java.util.*;

public class Reverse{
  public static long power(long x, long n) {
      if(n==0){
        return 1;
    }
    if(x == 0){
      return 0;
    }
    return x * power(x,n-1);
  }
  public static void main(String[] args){
    long x = 57;
    long n = 57;
    System.out.println(power(x,n));
  }
}

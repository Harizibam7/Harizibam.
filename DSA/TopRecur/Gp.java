import java.util.*;


public class Gp{
  public static float gp(int n){
    if(n == 0){
      return 1;
    }
    return (float)(1/ (Math.pow(3,n))) + gp(n-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(gp(n));
  }
}

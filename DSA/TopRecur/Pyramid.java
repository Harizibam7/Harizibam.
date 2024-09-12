import java.util.*;
public class Pyramid{
  public static void print(int n){
    if(n == 0){
      return;
    }
    System.out.print("* ");
    print(n-1);
  }
  public static void solve(int n, int i){
    if(n == 0){
      return;
    }
    print(i);
    System.out.println();
    solve(n-1,i+1);
  }
  public static void main(String[] args){
      int n = 5;
      solve(n,1);
  }
}

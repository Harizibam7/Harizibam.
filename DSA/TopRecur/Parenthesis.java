import java.util.*;
public class Parenthesis{
  public static void parenthesis(int i, char[] str, int n, int open, int close){
    if(close == n){
      for(int j =0; j < str.length;j++){
        System.out.print(str[j] + " ");
      }
      System.out.println();
    }else{
      if(open > close){
        str[i] = '}';
        parenthesis(i+1, str, n, open, close+1);
      }
      if(open < n){
        str[i] = '{';
        parenthesis(i+1, str, n, open+1, close);
      }
    }

  }
  public static void solve(char[] str, int n){
    if(n > 0){
       parenthesis(0, str,n, 0, 0);
    }
    return;
  }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] str = new char[2*n];
      solve(str, n);
  }
}

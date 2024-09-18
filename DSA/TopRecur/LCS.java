import java.util.*;

public class LCS{
  public static int lcs(String s1, String s2, int i , int j, int n,int m, int[][] dp){
    if(i == n || j == m ){
      return 0;
    }
    if(dp[i][j] != -1){
        return dp[i][j];
    }
    if(s1.charAt(i) == s2.charAt(j)){
      return dp[i][j] = 1 + lcs(s1, s2,i+1, j+1, n,m,dp);
    }
    return dp[i][j] = Math.max(lcs(s1,s2,i+1, j,n,m, dp), lcs(s1,s2, i,j+1,n,m,dp));
  }
  public static void main(String[] args){
      String s1 = "Harizibam";
      String s2 = "rizibam";
      int m = s1.length();
      int n = s2.length();
      int[][] dp = new int[m][n];
      for(int[] row:dp){
          Arrays.fill(row, -1);
      }
      System.out.println(lcs(s1, s2,0,0, m,n,dp));
  }
}

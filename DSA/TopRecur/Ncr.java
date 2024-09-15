import java.util.*;
class Ncr{
  public static int ncr(int n, int r){
    int res = 0;
    if(r == 0){
      return 1;
    }else{
      res = ncr(n, r-1) *  (n-r+1) / r;
    }
    return res;
  }
  public static void main(String[] args){
    int n= 3, r = 1;
    System.out.println(ncr(n,r));
  }
}

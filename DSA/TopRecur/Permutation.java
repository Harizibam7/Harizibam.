import java.util.*;

public class Permutation{
  public static void permutate(String str, int l , int r){
    if(l == r){
      System.out.println(str);
    }else{
      for(int i=l ;i<=r;i++){
        str = swap(str,l,i);
        permutate(str, l+1,r);
        str = swap(str,l,i);
      }
    }
  }
  public static String swap(String str, int l, int r){
    char[] temp = str.toCharArray();
    char text = temp[l];
    temp[l] = temp[r];
    temp[r] = text;
    return String.valueOf(temp);
  } 
  public static void main(String[] args){
    String str = "ABC";
    int n = str.length();
    permutate(str, 0, n-1);
  }
}



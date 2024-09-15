import java.util.*;

public class LPS{
  public static int lps(String str,int start, int end, int count){
    if(start > end){
      return count;
    }
    if(start == end){
      return count+1;
    }
    if(str.charAt(start) == str.charAt(end)){
      return lps(str, start+1, end-1, count+2);
    }
    return Math.max(lps(str,start, end-1, count), lps(str, start+1, end, count));
  }
  public static void main(String[] args){
    String str = "banana";
    System.out.println(lps(str, 0, str.length()-1, 0));
  }
}

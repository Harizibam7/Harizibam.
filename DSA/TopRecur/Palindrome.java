import java.util.*;

public class Palindrome{
  public static boolean palindrome(String str){
    int low = 0,high = str.length()-1;
    while(low < high){
      if(str.charAt(low) != str.charAt(high)){
        return false;
      }
      low++;
      high--;
    }
    return true;
  }
  public static void partition(ArrayList<ArrayList<String>> res, String s, int idx, ArrayList<String> cur){
    if(idx == s.length()){
      res.add(new ArrayList<>(cur));
      return;
    }
    String temp = "";
    for(int i =idx;i<s.length();i++){
      temp+= s.charAt(i);
      if(palindrome(temp)){
        cur.add(temp);
        partition(res, s, i+1, cur);
        cur.remove(cur.size()-1);
      }
    }
  
  }
  public static void main(String[] args){
    ArrayList<ArrayList<String>> res = new ArrayList<>();
    String s = "geeks";
    int idx = 0;
    ArrayList<String> cur = new ArrayList<>();
    partition(res, s, idx,cur);
    for(ArrayList<String> str: res){
        System.out.println(str);
    }
  }
}

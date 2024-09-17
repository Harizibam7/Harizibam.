import java.util.*;

public class Subset{
  public static void calc(List<Integer> arr, int index, List<Integer> sub, List<List<Integer>> result){
    result.add(new ArrayList(sub));
    for(int i = index;i<arr.size();i++){
      sub.add(arr.get(i));
      calc(arr, i+1, sub, result);
      sub.remove(sub.size()-1);
    }
  }
  public static List<List<Integer>> subset(List<Integer> arr){
      List<List<Integer>> result = new ArrayList<>();
      List<Integer> sub = new ArrayList<>();
      calc(arr, 0, sub, result);
      return result;
  }
  public static void main(String[] args){
    List<Integer> array = List.of(1,2,3);
    List<List<Integer>> res = subset(array);
    for(List<Integer> list : res){
      for(Integer l:list){
        System.out.print(l + " ");
      }
      System.out.println();
    }
  }
}

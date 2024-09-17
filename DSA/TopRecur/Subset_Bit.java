import java.util.*;

public class Subset_Bit{
  public static void subset(int[] arr, int n){
    for(int i =0; i < (1 << n);i++){
      for(int j = 0;j<n;j++){
        if((i & (1<<j)) != 0){
          System.out.print(arr[j] + " ");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int[] arr = new int[] { 1, 2, 3 };
    subset(arr, arr.length);
  }
}

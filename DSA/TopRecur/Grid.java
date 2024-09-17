import java.util.*;

public class Grid{
  public static void print(List<Integer> path){
    for(int i : path){
        System.out.print(i + " ");
    }
    System.out.println();
  }
  public static void path(int i,int j,int[][] arr, List<Integer> path, int n, int m){
    if((i == n-1) && (j == m-1)){
      path.add(arr[i][j]);
      print(path);
      path.remove(path.size()-1);
      return;
    }
    if(i< 0 || j < 0 || j >= m || j >= n){
      return;
    }

    path.add(arr[i][j]);
    if(j+1 < m){
      path(i, j+1, arr, path, n, m);
    }

    if(i +1 < n){
      path(i+1, j, arr, path, n, m);
    }
    path.remove(path.size()-1);
    
  }
  public static void main(String[] args){
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    List<Integer> path = new ArrayList<>();
    path(0,0,arr,path, arr.length, arr[0].length);
  }
}

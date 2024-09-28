import java.util.*;

class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    this.left = this.right = null;
  }
}

public class lca{
  static Node root;
  private static List<Integer> path1 = new ArrayList<>();
  private static List<Integer> path2 = new ArrayList<>();

  public static int findLCA(int n1, int n2){
    path1.clear();
    path2.clear();
    return lca(root, n1, n2);
  }

  public static int lca(Node root, int n1, int n2) {
    if(!find(root, n1, path1) || !find(root, n2, path2)){
      System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
      System.out.println((path2.size() > 0 )? "n2 is present" : "n2 is missing");
      return -1;
    }
    int i;
    for(i =0; i<path1.size() && i < path2.size() ;i++){
      if(!path1.get(i).equals(path2.get(i))){
        break;
      }

    }
    return path1.get(i-1);
  }

  public static boolean find(Node root, int n, List<Integer> path){
    if(root == null){
      return false;
    }
    path.add(root.data);
    if(root.data == n || find(root.left, n, path) || find(root.right, n, path)){
      return true;
    }
    path.remove(path.size()-1);
    return false;
  }

  public static void main(String[] args){
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println(findLCA(4,5));
    System.out.println(findLCA(4,2));
    System.out.println(findLCA(3,4));
    System.out.println(findLCA(2,4));
  }
}

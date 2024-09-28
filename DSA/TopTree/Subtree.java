


class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    this.left = this.right = null;
  }
}

public class Subtree{
  
  public static boolean areIdentical(Node T, Node S){
    
    if(T == null && S == null){
      return true;
    }
    if(T == null || S == null){
      return false;
    }
    
    return (T.data == S.data) && (areIdentical(T.left,S.left) && areIdentical(T.right, S.right));

  }
  public static boolean isSubtree(Node T, Node S){
    if(S == null){
      return true;
    }
    if(T == null){
      return false;
    }

    if(areIdentical(T, S)){
      return true;
    }
    return isSubtree(T.left, S.left) || isSubtree(T.right, S.right);
  }

  public static void main(String[] args){
    Node T = new Node(26);
    T.left = new  Node(10);
    T.right = new Node(3);
    T.left.left = new Node(4);
    T.left.left.right = new Node(30);
    T.left.right = new Node(6);
    T.right = new Node(3);
    T.right.right = new Node(3);
    
    Node S = new Node(10);
    S.left = new Node(4);
    S.right = new Node(6);
    S.left.right = new Node(30);
    
    if(isSubtree(T,S)){
      System.out.println("Tree 2 is subtree of Tree 1");
    }else{
      System.out.println("Tree 2 is not a subtree of Tree 1");
    }
  }
}

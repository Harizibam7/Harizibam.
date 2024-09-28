
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    this.left = this.right = null;
  }
}

public class Substree{

  public static void preorder(Node tree, String val){
    if(tree == null){
        return;
    }

    val+=tree.data;   
    preorder(tree.left, val);
    preorder(tree.right, val); 
  }

  public static void inorder(Node tree, String val){
    if(tree == null){
      return;
    }

    val+=tree.data;   
    inorder(tree.left, val);
    inorder(tree.right, val); 
  }


  public static boolean subtree(Node T, Node S){
    String pre_order_t = "";
    String in_order_t = "";
    
    preorder(T, pre_order_t);
    inorder(T, in_order_t);
    String pre_order_s ="";
    String in_order_s = ""; 
    
    preorder(S, pre_order_s);
    preorder(S, in_order_s);
    return pre_order_t.contains(pre_order_s) && in_order_t.contains(in_order_s) ;
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

    if(subtree(T, S)){
      System.out.println("Tree 2 is a subtree of Tree 1.");
    }else{
      System.out.println("Tree 2 is not a substree of Tree 1.");
    }
    
  }
}

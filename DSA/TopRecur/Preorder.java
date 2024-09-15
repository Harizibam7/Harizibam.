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

public class Preorder{
  public static void preorder(Node node){
    if(node == null){
      return ;
    }
    
    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);
  }
  public static void inorder(Node node){
    if(node == null){
      return;
    }
    
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }
  public static void postorder(Node node){
    if(node == null){
      return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + " ");
  }
  public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(3);
    root.right = new Node(2);
    root.left.left = new Node(13);
    root.left.right = new Node(15);
    root.right.left = new Node(17);
    root.right.right = new Node(30);
    System.out.println("Preorder ");
    preorder(root);
    System.out.println();
    System.out.println("Inorder");
    inorder(root);
    System.out.println();
    System.out.println("Postorder");
    postorder(root);
  }
}

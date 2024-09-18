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


public class Right{
  public static void right(Node node){
    if(node == null){
      return ;
    }
    List<Integer> result = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    while(!q.isEmpty()){
      int size = q.size();
      List<Integer> temp = new ArrayList<>();
      while(size-- > 0){
        Node curr = q.peek();
        temp.add(curr.data);
        q.remove();
        if(curr.left != null){
          q.add(curr.left);
        }
        if(curr.right != null){
          q.add(curr.right);
        }
      }
      result.add(temp.get(temp.size()-1));
    }
    for(int i : result){
      System.out.print(i + " ");
    }
  }
  public static void main(String[] args){
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.left.right = new Node(5);
      root.right = new Node(3);
      right(root);
  }
}


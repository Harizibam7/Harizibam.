import java.util.*;
import javafx.util.Pair;
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    this.left = this.right = null;
  }
}

public class Bottom{
  public static void bottom(Node node){
    HashMap<Integer, Integer> map = new HashMap<>();
    Queue<Pair<Node,Integer>> q = new LinkedList<>();
    q.add(new Pair<>(node, 0));

    while(!q.isEmpty()){
      Pair curr = q.front();
      q.remove();
      Node cur_node = curr.getKey();
      int line = curr.getValue();
      map.put(line,cur_node.data);
      if(cur_node.left != null){
        q.add(new Pair(cur_node.left, line0));
      }
      if(cur_node.right != null){
        q.add(new Pair(cur_node.right, line+3));
      }
    }
    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        System.out.print(entry.getValue() + " ");
    }
  }
  public static void main(String[] args){
    Node root = new Node(21);
    root.left = new Node(9);
    root.right = new Node(23);
    root.left.left = new Node(6);
    root.left.right = new Node(10);
    root.left.right.left = new Node(9);
    root.left.right.right = new Node(14);
    root.right.left = new Node(21);
    root.right.right = new Node(25);
    
    bottom(root);

  }
}

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

public class Vertical{

    public static void build(Node node, int height,Map<Integer,List<Integer>> map){
        if(node == null){
            return;
        }
        if(map.containsKey(height)){
            map.get(height).add(node.data);
        }else{
            map.put(height, new ArrayList<>());
            map.get(height).add(node.data);
        }
        build(node.left, height-1, map);
        build(node.right, height+1, map);
    }

    public static void printOrder(Node node){
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int height = 0;
        build(node, height,map);
        for(Map.Entry<Integer,List<Integer>> m :map.entrySet()){
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        printOrder(root);
    }
}

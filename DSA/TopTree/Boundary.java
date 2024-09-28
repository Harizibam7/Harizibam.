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
public class Boundary {
    public static void boundaryLeft(Node node,Set<Integer> set){
        if(node == null){
            return;
        }
        set.add(node.data);
        if(node.left != null){
            boundaryLeft(node.left,set);
        }else if(node.right != null){
            boundaryLeft(node.right,set);
        }
    }
    public static void boundaryRight(Node node, Set<Integer> set){
        if(node == null){
            return;
        }
        set.add(node.data);
        if(node.right != null){
            boundaryRight(node.right, set);
        }else if(node.left != null){
            boundaryRight(node.left, set);
        }
    }
    public static void print(Node node, Set<Integer> set){
        if(node == null){
            return;
        }        

        print(node.left,set);
        if(node.left == null && node.right == null){
            set.add(node.data);
        }
        print(node.right, set);
    }
    public static void printBoundary(Node node, Set<Integer> set){
        if(node == null){
            return;
        }
        set.add(node.data);
        System.out.println(set);
        boundaryLeft(node,  set);
        System.out.println(set);
        print(node.left,set);
        System.out.println(set);
        print(node.right,set);
        System.out.println(set);
        boundaryRight(node, set);
        System.out.println(set);
    }
    public static void main(String[] args){
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        Set<Integer> set = new HashSet<>();
        printBoundary(root,set);
        System.out.println(set);
    }
}

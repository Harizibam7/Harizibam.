import java.util.*;

class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

public class Delete{
  public static void print(Node head){
    if(head == null){
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print( temp.data+ " ");
      temp = temp.next;
    }
  }
  public static void solve(Node head){
    if(head == null){
        return;
    }
    solve(head.next);
    head.next = null;
  }
  public static void main(String[] args){
    Node node = new Node(10);
    node.next = new Node(2);
    node.next.next = new Node(3);
    node.next.next.next = new Node(4);
    node.next.next.next.next = new Node(11);
    node.next.next.next.next.next = new Node(12);
    System.out.println("Before");
    print(node);
    solve(node);
    node = null;
    System.out.println("After");
    print(node);
  }
}

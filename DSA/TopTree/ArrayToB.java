class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    this.left = this.right = null;
  }
}

public class ArrayToB{
  public static Node bst(int arr[], int start, int end){
    if(start > end){
      return null;
    }
    
    int mid = (start + end)/2;
    Node node = new Node(arr[mid]);
    
    node.left = bst(arr,start, mid-1);
    node.right = bst(arr,mid+1,end);
    return node;
  }
  public static void preorder(Node node){
      if(node == null){
        return;
      }
      System.out.println(node.data);
      preorder(node.left);
      preorder(node.right);
  }
  public static void main(String[] args){
    int arr[] = new int[]{1,2,3,4,5,6,7}; 
    int n = arr.length;
    Node root = bst(arr,0,n-1);
    preorder(root);
  }
}

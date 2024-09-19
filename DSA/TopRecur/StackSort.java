 import java.util.*;
 public class StackSort{
   public static void push(Stack<Integer> s, int x){
      if(s.isEmpty() || s.peek() < x){
        s.push(x);
        return;
     }
      
     int temp = s.pop();
      push(s,x);
     s.push(temp);
   }
    public static void sort(Stack<Integer> s){
      if(s.isEmpty()){
        return;
     }
     int temp = s.pop();
      sort(s);
      push(s, temp);
   }
    public static void main(String[] args){
      Stack<Integer> s = new Stack<>();
      s.push(34);
      s.push(3);
      s.push(31);
      s.push(98);
      s.push(92);
      s.push(23);
      sort(s);
      System.out.println(s);
   }
 }

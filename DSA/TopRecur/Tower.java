import java.util.*;

public class Tower{
  public static void tower(int n, char from, char to, char aux){
    if(n == 0){
      return;
    }
    tower(n-1, from, aux , to);
    System.out.println("Disk " + from + " to " + to);
    tower(n-1, aux, to, from);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    tower(n, 'A','C','B');
  }
}

import java.util.*;
class Product{
  public static int product(int x, int y){
      if(y > x){
        return product(y, x);
    }
    if(y != 0){
      return x + product(x,y-1);
    }else{
      return 0;
    }
  }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x,y;
      x = sc.nextInt();
      y = sc.nextInt();
      System.out.println("Product Of Two numbers " + product(x,y));
  }

}

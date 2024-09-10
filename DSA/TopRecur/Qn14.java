public class Qn14{

  public static void fibo(int n, int a, int b){
    if(n > 0){
      fibo(n-1,b,a+b);
      System.out.print(a+ " ");
    } 
  }

  public static void main(String[] args){
      int n = 10;
      fibo(n, 0, 1);     
  }
}

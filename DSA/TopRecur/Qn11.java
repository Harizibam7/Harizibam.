import java.util.Scanner;

public class Qn11 {
    public static int solve(int n){
        if(n == 0){
            return 0;
        }else if( n== 1 ){
            return 1;
        }
        return solve(n - 2) + solve(n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}

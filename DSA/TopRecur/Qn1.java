import java.util.Scanner;

public class Qn1{
    public static void solve(int n){
        if(n <= 0){
            return;
        }
        solve(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}
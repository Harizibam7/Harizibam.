import java.util.Scanner;

public class Qn9 {
    public static int solve(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + solve(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(solve(n));
    }
}

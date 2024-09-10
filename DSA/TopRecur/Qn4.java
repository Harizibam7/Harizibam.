public class Qn4 {
    public static int solve(int n){
        if(n == 1){
            return n;
        }
        return n + solve(n-1);
    }
    public static void main(String[] args){
        int n= 6;
        System.out.println(solve(n));
    }
}

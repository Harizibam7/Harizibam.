import java.util.Scanner;

public class Qn7 {
    public static void solve(String str, int n){
        if(str == null || str.length() <= 1){
            System.out.println(str);
        }else{
            System.out.print(str.charAt(str.length() - 1));
            solve(str.substring(0, str.length()-1), str.length()-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solve(str,str.length());
    }
}

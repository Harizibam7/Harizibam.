import java.util.Scanner;

public class Qn8 {
    public static int solve(String str){
        if(str.equals("")){
            return 0;
        }else{
            return 1 + solve(str.substring(1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(solve(str));
    }
}

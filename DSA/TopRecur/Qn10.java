public class Qn10 {
    public static int solve(int arr[], int n, int sum  ){
        if(n == 0){
            return sum;
        }
        return solve(arr, n-1, sum + arr[n-1]);
    }
    public static void main(String[] args){
        int arr[] = {2,55,1,7};
        System.out.println(solve(arr,arr.length, 0));
    }
}

public class Qn6 {
    public static int solve(int i,int[] arr, int n){
        if(i == n){
            return 0;
        }
        return arr[i] + solve(i+1, arr, n);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(solve(0,arr, arr.length));
    }
}

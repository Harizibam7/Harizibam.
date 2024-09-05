class Max{
  public static int maxSum(int arr[], int n){
      int max_sum = Integer.MIN_VALUE;
      int sum = 0;
      int mul = 0;  
    for(int i =0; i<n ;i++){
        sum += arr[i];
        mul+= (i* arr[i]); 
    }
    max_sum = mul;
    for(int i =0;i<n;i++){
      int temp = sum - arr[i];
      int val = mul - temp;
      val+= (arr[i]*(n-1));
      max_sum = Math.max(max_sum, val);
      mul = val;
    }
      return max_sum;
  }
  public static void main(String args[])
  {
        int arr[] = {60, 90,0, 80, 70};
        int n = arr.length;
        System.out.println(maxSum(arr, n));
  }
}

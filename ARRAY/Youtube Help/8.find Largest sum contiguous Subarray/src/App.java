public class App {

    //Ref: https://www.youtube.com/watch?v=HCL4_bOd3-4
    //Kadane Algorithm O(n)
    static int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=0;
        int max=arr[0];
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > max) max=sum;
            if(sum < 0) sum=0;
        }
        return max;
        
    }
    
        
    public static void main(String[] args) {
        int Arr[] = {1,2,3,-2,5};
        int n=Arr.length;
         System.out.println( maxSubarraySum(Arr, n));
        
    }
}

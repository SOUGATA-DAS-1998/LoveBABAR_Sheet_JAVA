public class App {

    //find Largest sum contiguous Subarray [V. IMP]

    //maximum sum Subarray of O(n3)
    static int SubarraySum(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum + arr[k];
                }
                if(max < sum) max=sum;
            }
        }
        return max;
        
    }
     //maximum sum Subarray of O(n2)
    static int SubarraySumQuadritic(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
            }
            if(max < sum) max=sum;
        }
        return max;
        
    }


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

      // System.out.println( maxSubarraySum(Arr, n));
       System.out.println(SubarraySum(Arr, n));
    }
}

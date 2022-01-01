import java.util.*;


//ref: https://www.youtube.com/watch?v=Av7vSnPSCtw
public class App {
    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        
        int ans=arr[n-1] - arr[0];
        
        int smallest= arr[0]+k;
        int largest= arr[n-1]-k;
        int min,max;
        
        for(int i=0;i<n-1;i++){
            min=Math.min(smallest,arr[i+1]-k);
            max=Math.max(largest,arr[i]+k);
            if(arr[i] < 0) continue;
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
    public static void main(String[] args){
       int arr[] = {1, 5, 8, 10};
        int K = 2, N = 4;
        
        System.out.println(getMinDiff(arr, N, K));
    }
}

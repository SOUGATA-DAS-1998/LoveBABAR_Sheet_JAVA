public class App {


//Ref:https://www.youtube.com/watch?v=UZG3-vZlFM4


//This a array Preprocesing problem solution 
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int left[]=new int[n];
        int right[]=new int[n];
        
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        //Checking the highest building in the left side
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        
        //Checking the highest building in the right side
         for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        
        long ans=0;
        //Again traversing the array and finding the minimum from left and right array and - from the arr[i] element
        
        for(int i=0;i<n;i++){
            ans += (Math.min(left[i],right[i]) - arr[i]);
        }
        return ans;
    } 


    public static void main(String[] args) throws Exception {
        
       int N = 6;
        int arr[] = {3,0,0,2,0,4};

        System.out.println(trappingWater(arr, N));
    }
}

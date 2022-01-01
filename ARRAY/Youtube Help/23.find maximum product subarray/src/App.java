
//Reference: https://www.youtube.com/watch?v=jzQ-f2uU0UU

public class App {

   static long maxProduct(int[] arr, int n) {
    
        long ans=Long.MIN_VALUE;
        long cpro=1;
        
        
        for(int i=0;i<n;i++){
            cpro *=arr[i];
            
            ans=Math.max(ans,cpro);
            if(cpro == 0){
                cpro=1;
            }
        }
        cpro=1;
           for(int i=n-1;i>=0;i--){
            cpro *=arr[i];
            
            ans=Math.max(ans,cpro);
            if(cpro == 0){
                cpro=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        
        int arr[]={6,0, -3, -10, 0, 2};
        int n=arr.length;

        System.out.println(maxProduct(arr, n));
    }
}

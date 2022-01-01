public class App {

   
//Ref:  https://www.youtube.com/watch?v=6_-zOrJlTDo
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        
        int fav=0,nonFav=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k) fav++;
        }
        
        for(int j=0;j<fav;j++)
        {
            if(arr[j]>k) nonFav++;
        }
        
        int l=0,r=fav-1, result = Integer.MAX_VALUE;
        
        while(r<n)
        {
            result = Math.min(result,nonFav);
            r++;
            if(r<n && arr[r]>k) nonFav++;
            if(l<n && arr[l]>k) nonFav--;
            l++;
        }
        
        return (result  == Integer.MAX_VALUE)?0:result;
        
    }

    public static void main(String[] args) throws Exception {
        
        int arr[] = {2, 1, 5, 6, 3};
        int n=arr.length; 
        int K = 3;

        System.out.println(minSwap(arr, n, K));

    }
}

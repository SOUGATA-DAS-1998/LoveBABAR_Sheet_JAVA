//https://www.youtube.com/watch?v=Tqa9pilFrhY


import java.util.*;

public class App {

   static int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
       for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int count=0;
        
        for(int i=0;i<n;i++){
            if(map.containsKey( k - arr[i] ))
                count += map.get(k-arr[i]);
            
            
            if(k-arr[i] == arr[i]) count--;
        }
        
        return count/2;  //to remove the duplicate count ....Here the duplicate count gets double so it is divided by 2
    }
    public static void main(String[] args) throws Exception {
        
        int N = 4, K = 6;
        int arr[] = {1, 5, 7, 1};

       System.out.println( getPairsCount(arr, N, K) );
    }
}

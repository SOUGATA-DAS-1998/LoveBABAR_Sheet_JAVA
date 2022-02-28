/* Ref: https://www.youtube.com/watch?v=wSOfYesTBRk */

/* 
Input:
5
1 2 4 8 9
3
Output:
The largest minimum distance: 3
*/

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int cows = sc.nextInt();
        largestMinDistance(arr, cows,size);
        sc.close();
    }

    public static void largestMinDistance(int ar[],int cows,int n){
        int low= 0,high = ar[n-1] - ar[0];
        int res =0;
        while( low <= high){

            int mid = (low + high)/2;
            if(canPlaceCows(ar,cows,mid)){
                res = mid;
                low = mid+1;
            }else{
                high= mid-1;
            }
        }
        System.out.println("The Largest minimum distance: " +res);
    }

    public static boolean canPlaceCows(int ar[],int cows,int dist){
        int n=ar.length;
        int cow_Posi = ar[0],count=1;
        for(int i=1;i<n;i++){
            if(ar[i] - cow_Posi >= dist){
                count++;
                cow_Posi = ar[i];
            }
            if(count == cows)return true;
        }
        return false;
    }
}

/* Ref: https://www.youtube.com/watch?v=-Nx1h54KzUQ */

/* 
Input:
10
4
1 2 3 4
Output:
Time required: 12
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int paratha = sc.nextInt();
        int cooks = sc.nextInt();

        int[] arr = new int[cooks];
        for (int i = 0; i < cooks; i++) {
            arr[i] = sc.nextInt();
        }

        timeRequired(arr, paratha);
        sc.close();
    }

    public static void timeRequired(int a[],int paratha){
        int low=0;
        int high=Integer.MAX_VALUE;
        int ans=0;

        while(low <= high){
            int mid=(low+high)/2;
            if(isParathaPrepared(a,mid,paratha)){
                ans=mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("Time required: "+ ans);
    }

    public static boolean isParathaPrepared(int arr[],int mid,int paratha){
        int time=0;
        int readyParatha =0;
        
        for(int i=0;i<arr.length;i++){
            time=arr[i];
            int j=2;
            while(time <= mid){
                readyParatha++;
                 time +=(arr[i] * j);
                 j++;
            }

            if(readyParatha >= paratha)return true;
        }
        return false;
    }
}
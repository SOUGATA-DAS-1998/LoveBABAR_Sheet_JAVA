/* Ref: https://www.youtube.com/watch?v=tkoucfh10SI */

/* 
Input:
5
4 42 42 26 46
20
Output:
Minimum saw length: 36
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
        int wood = sc.nextInt();
        minLength(arr, wood);
        sc.close();
    }

    public static void minLength(int a[],int wood){
        int low=0,high=0,ans=0;

        for(int i:a){
            high=Math.max(i,high);
        }

        while(low <= high){
            int mid =(low + high)/2;
            if(solve(a,wood,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println("Minimum saw length: "+ ans);;
    }

    public static boolean solve(int arr[],int wood,int mid){
        int sum=0;

        for(int val:arr){
            if(val > mid){
                sum += val-mid;
            }
        }
        return sum>=wood;
    }

}
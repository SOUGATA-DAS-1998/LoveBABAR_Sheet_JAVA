/* Ref:https://www.youtube.com/watch?v=hT1sOIcenBA */

/* 
Input:
7
1 2 3 4 5 6 7
3
3
10
2
Output:
Round 1: Soldier defeat: 3, Power gained: 6
Round 2: Soldier defeat: 7, Power gained: 28
Round 3: Soldier defeat: 2, Power gained: 3
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int rounds = sc.nextInt();
        int[] power = new int[rounds];
        for (int i = 0; i < rounds; i++) {
            power[i] = sc.nextInt();
        }
        //winning(arr, size, power);
        sc.close();
    }

    public static void winning(int []arr,int n,int power[]){
        Arrays.sort(arr);

        int sum[] = new int[n];
           sum[0] =  arr[0];
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1] + arr[i];
        }

        for(int j=0;j<power.length;j++){
            int ans = upBound(arr,0,n,power[j]);
            System.out.println("Round " + (j+1) + ": Soldier defeat: " + ans + ", Power gained: " + sum[ans - 1]);
        }

    }

    static int upBound(int arr[],int l,int h,int p){
        while(l < h){
            int mid = l+ (h-l) /2;

            if(arr[mid] <= p)
                l =mid+1;
            
            else
                h=mid;
            
            }
            return l;
    }
}

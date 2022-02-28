// Ref: https://www.youtube.com/watch?v=nv7F4PiLUzo&t=737s

/* 
Input:
6 4
1 3 4 7 10 12
2 3 6 15
5
Output:
5th element in two sorted array: 4
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(k + "th element in two sorted array: " + findTwoElement(arr1, arr2, size1, size2, k));
        sc.close();
    }

    public static int findTwoElement(int[] arr1, int[] arr2, int n, int m, int k) {
        if(n > m){
            return findTwoElement(arr2, arr1,m,n,k);
        }

        int lo = Math.max(0, k-m);
        int hi = Math.min(k , n);

        while( lo <= hi){
            int cut1 = (lo + hi)/2;
            int cut2 = k - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == n) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == m) ? Integer.MAX_VALUE : arr2[cut2];

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1, l2);
            }
            else if( l1 > r2){
                hi =cut1 -1;
            }else{
                lo = cut1 + 1;
            }
        }
        return 1;
    
    }
}
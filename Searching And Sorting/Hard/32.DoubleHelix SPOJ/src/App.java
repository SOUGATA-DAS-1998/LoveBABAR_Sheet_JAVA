/* Ref: https://www.youtube.com/watch?v=w-6YHcGmSxM */

/* 
Input:
13 11
3 5 7 9 20 25 30 40 55 56 57 60 62
1 4 7 11 14 25 44 47 55 57 100
Output:
Maximum sum: 450
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
        maxSum(arr1, arr2);
        sc.close();
    }

    public static void maxSum(int a1[],int a2[]){
        int s1=0,s2=0;
        int i=0,j=0;
        int ans=0;

        while( i < a1.length && j < a2.length){
            if(a1[i] < a2[j]){
                s1 +=a1[i++];
            }else if( a2[j] < a1[i]){
                s2 += a2[j++];
            }else{
                ans +=Math.max(s1,s2)+a1[i];
                s1 =s2 =0;
                i++;
                j++;
            }
        }

        while( i < a1.length){
            s1 +=a1[i++];
        }

        while(j < a2.length){
            s2 +=a2[j++];
        }

        ans +=Math.max(s1,s2);
        System.out.println("Maximum Sum: "+ ans);
    }
}
/* 
Input:
10 20
3
1
5
12
Output:
1th smallest element: 10
5th smallest element: 14
Not possible
*/


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int noValues = sc.nextInt();
        int[] values = new int[noValues];
        for (int i = 0; i < noValues; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < noValues; i++) {
            kthSmallest(low, high, values[i]);
        }
        sc.close();
    }
        public static void kthSmallest(int l,int h,int k){
            if( h - l + 1 < k){
                System.out.println("Not Possible");
            }else{
                System.out.println(k+"th smallest Element "+ (l-k+1));
            }
        }
    }
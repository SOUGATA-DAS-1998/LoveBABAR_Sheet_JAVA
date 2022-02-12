/* 
Input:
6
2 4 5 7 7 6
2 6
Output:
6 present on index 5
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
        int k = sc.nextInt();
        int x = sc.nextInt();
       System.out.println( search(arr, k, x));
        sc.close();
    }

    private static int search(int[] arr, int k, int x) {

        int index=0;
        while(index < arr.length){

            if(arr[index] == x)return index;

            int step = Math.abs(arr[index] - x) / k;
            index = index + Math.max(1,step);
        }
        return -1;
    }
}
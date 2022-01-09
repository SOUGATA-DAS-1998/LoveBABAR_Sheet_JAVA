import java.util.*;

//Ref: https://www.youtube.com/watch?v=IhsUbEMfIbY

/* Code link for Next greater Element
ref: https://www.youtube.com/watch?v=fOeD3CW2c7c
*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        sc.close();
    }

    static void nextPermutation(int arr[]){
        int i=arr.length - 2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(j>=0 && arr[j] <= arr[i]) j--;
            swap(arr,i,j);
        }
        reverce(arr,i+1);

        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverce(int []arr,int start){
        int end=arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

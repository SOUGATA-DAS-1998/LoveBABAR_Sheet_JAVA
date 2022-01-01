import java.util.Arrays;
import java.util.Scanner;

public class App{

// It is a hard problem not understand easily

//Youtube link to understand this code
// https://www.youtube.com/watch?v=H7ADLLVrxis&t=1350s
    // public static void merge(int arr1[], int arr2[], int n, int m) {
    //     // code here
    //     int gap = n+m;
    //     int i=0, j=0;
        
    //     for(gap = nextGap(gap); gap > 0; gap = nextGap(gap) ){
    //         for(i =0 ;i+gap < n; i++){
    //         if(arr1[i] > arr1[i+gap])
            
    //             arr1[i] += arr1[i+gap] - (arr1[i+gap] = arr1[i]) ;
    //         }
            
    //         for(j = (gap> n )? (gap-n) : 0 ; i<n && j<m; i++,j++ ){
                
    //             if(arr1[i] > arr2[j])
                
    //             arr1[i] += arr2[j] - (arr2[j] = arr1[i]);    
                
    //         }
    //         if(j < m){
    //             for(j=0; j+gap <m; j++){
    //                 if(arr2[j] > arr2[j+gap])
                    
    //                     arr2[j] += arr2[j+gap] - (arr2[j+gap] = arr2[j]) ; 
    //             }
    //         }
    //     }
    // }
    
    // static int nextGap(int gap){
        
    //     if(gap <= 1)
    //         return 0;
    //         return (gap/2 + gap%2); // It is returning the Ceil value of gapc can also be done as Math.ceil
       
    // }


    public static void mergeSortArr(int[] ar1, int[] ar2) {
        int n = ar1.length;
        int m = ar2.length;

        int i = n-1;
        int j = 0;
        
        while(i>=0 && j <m){
            if(ar1[i] > ar2[j]){
                int temp = ar1[i];
                ar1[i] = ar2[j];
                ar2[j] = temp;
                
                i--;
                j++;
            }
            else
                break;
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
    }

    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            for (int i = 0; i < size1; i++)
                arr1[i] = sc.nextInt();

            for (int i = 0; i < size2; i++)
                arr2[i] = sc.nextInt();

            // 4 5
            // 1 3 5 7
            // 0 2 6 8 9
            mergeSortArr(arr1, arr2);
            
            for (int i : arr1) 
                System.out.print(i + " ");

            for (int i : arr2) 
                System.out.print(i + " ");
            
        }
        sc.close();
    }
}

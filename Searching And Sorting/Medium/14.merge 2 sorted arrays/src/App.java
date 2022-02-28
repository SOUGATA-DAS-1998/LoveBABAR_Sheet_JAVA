
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < size2; i++)
            arr2[i] = sc.nextInt();

        mergeSortArr(arr1, arr2,size1,size2);

        System.out.println("After merger: ");
        for (int i : arr1)
            System.out.print(i + " ");

        for (int i : arr2)
            System.out.print(i + " ");

        sc.close();
    }
    public static void mergeSortArr(int arr1[], int arr2[], int n, int m) {
        // code here
        int i=0,j=0,k=n-1;
        
        while( i <= k && j<m){
            
            if(arr1[i] < arr2[j]){
                i++;
                continue;
            }else{
                int temp=arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                k--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}

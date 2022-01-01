import java.util.Scanner;

public class App{


    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void partition(int a[],int n,int pivot){
        int i=0,j=0;

        while(i < n){
            if(a[i] > pivot) i++;
            else{
                swap(a, i, j);
                i++;
                j++;
            }
        }
        for(int k=0;k<n;k++)
        System.out.print(a[k]+ " ");
    }
    
    static void partitionEvenOdd(int a[],int n){
        int i=0,j=0;

        while(i < n){
            if(a[i] % 2 == 1 ) i++;
            else{
                swap(a, i, j);
                i++;
                j++;
            }
        }
        for(int k=0;k<n;k++)
        System.out.print(a[k]+ " ");
    }
    
    static void partition_Positive_Negative(int a[],int n){
        int i=0,j=0;

        while(i < n){
            if(a[i] < 0 ) i++;
            else{
                swap(a, i, j);
                i++;
                j++;
            }
        }
    
        for(int k=0;k<n;k++)
        System.out.print(a[k]+ " ");
    }
    public static void main(String[] args) {
        int ar[]={7,9,4,8,3,6,2,1};
        int ar1[]={7,-9,4,-8,3,6,-2,-1};
        int n=ar.length;

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Pivot value");
        // int pivot=sc.nextInt();
        sc.close();

        // for(int i=0;i<n;i++){
        //     syso
        // }
       // partition(ar, n, pivot);
          //  partitionEvenOdd(ar, n);
          partition_Positive_Negative(ar1, n);
    }
}

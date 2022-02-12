public class App {
    //REf: https://www.youtube.com/watch?v=MMt2x6an_i8 
    public static void main(String[] args) throws Exception {
       // int arr[] = {64,25,12,22,11};
        int arr[] = {3,1,2,4};
        int n=arr.length;
        InsertSort(arr, n);
        printArray(arr);
    }

    static void InsertSort(int a[],int n){
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                }else{
                    break;
                }
            }
        }
    }

    static boolean isSmaller(int a[],int i,int j){
        System.out.println("Comparing "+a[i]+" and "+a[j]);
        if(a[i] < a[j]){
            return true;
        }else{
            return false;
        }
    }
 
    static void swap(int a[],int i,int j){
        System.out.println("Swapping "+a[i]+" and "+a[j]);
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }
        // Prints the array
        static void printArray(int a[])
        {
            int n = a.length;
            for (int i=0; i<n; ++i)
                System.out.print(a[i]+" ");
            System.out.println();
        }
}


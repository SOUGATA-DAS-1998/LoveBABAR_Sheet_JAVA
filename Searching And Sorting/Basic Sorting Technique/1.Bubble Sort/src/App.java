public class App {
    /* Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
Auxiliary Space: O(1) */
    public static void main(String[] args) throws Exception {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort(arr);
        printArray(arr);
    }

    static void BubbleSort(int a[]){
        
        int n=a.length;
        for(int i=0;i<n-1;i++){ //in bubbleSort n-1 iteration happen
            
            for(int j=0;j< n-i-1;j++){
                 // swap arr[j+1] and arr[j]
                if(a[j] > a[j+1]){
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                }
            }
            

        } 
    }

    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.err.print(a[i]+" ");
        }
    }
}

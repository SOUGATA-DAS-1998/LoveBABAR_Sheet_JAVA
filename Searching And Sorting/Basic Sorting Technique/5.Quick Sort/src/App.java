public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = {64,25,12,22,11};
        int n=arr.length;
        sort(arr, 0, n-1);
        printArray(arr);
    }

    static int  Partition(int a[],int pivot,int l,int r){
        // int mid=(l+r)/2;
        // int pivot = a[mid];
        int i=l;
        int j=l;

        while( i <= r){
            if(a[i] <= pivot){
                swap(a, i, j);
                i++;
                j++;
            }else{
                i++;
            }
            
        }
        return j;
    }

 /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
          static  void sort(int arr[], int low, int high)
          {
              if (low < high) //for checking atleast two elements in the aray
              {
                  return;
              }
                  /* pi is partitioning index, arr[pi] is 
                    now at right place */
                    //int mid=(low+high)/2;
                    int pivot=arr[high];
                  int pi = Partition(arr,pivot, low, high);
        
                  // Recursively sort elements before
                  // partition and after partition
                  
                  sort(arr, low, pi-1);
                  sort(arr, pi+1, high);
                  
              
          
        }



    static void swap(int a[],int i,int j){
        //System.out.println("Swapping "+a[i]+" and "+a[j]);
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

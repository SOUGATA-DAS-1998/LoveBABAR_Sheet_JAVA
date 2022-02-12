
/*  */

public class App {
    //REf: https://www.youtube.com/watch?v=EU9FIt1t-Is
    public static void main(String[] args) throws Exception {
        int arr[] = {64,25,12,22,11};
        int n=arr.length;
        SelectSort(arr, n);
        printArray(arr);
    }
      // Prints the array
      static void printArray(int a[])
      {
          int n = a.length;
          for (int i=0; i<n; ++i)
              System.out.print(a[i]+" ");
          System.out.println();
      }
   static void SelectSort(int a[],int n){
    for(int i=0;i<n-1;i++){
        
        int min_indx=i;
        for(int j=i+1;j<n;j++){
            if(a[j] < a[min_indx]){
                min_indx = j;
            }
            swap(a, min_indx,i);
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
}


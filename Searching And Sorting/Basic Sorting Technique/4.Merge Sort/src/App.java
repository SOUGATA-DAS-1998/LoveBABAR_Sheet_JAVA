public class App {
    //Divide and Conqurer technique
    public static void main(String[] args) throws Exception {
        int arr[] = {64,25,12,22,11};
        int n=arr.length;

        mergeSort(arr, 0, n-1);
        printArray(arr);
        }

        static void mergeSort(int a[],int left,int right){
            if(left < right){
                int mid=(left +right) / 2;
                mergeSort(a, left, mid);
                mergeSort(a, mid+1, right);
                merge(a, left, mid, right);
            }

        }

        static void merge(int a[],int left,int mid,int right){
            int ans[] = new int[a.length];
        
            int i=left;
            int j=mid+1;
            int k=left;

            while(i <= mid && j<=right){
                if(a[i] < a[j]){
                    ans[k] = a[i];
                    i++;
                }else{
                    ans[k] = a[j];
                    j++;
                }
                k++;
            }

            if(i > mid){
                while(j<= right){
                    ans[k++] = a[j++];
                }
            }else{
                while(i<=mid){
                    ans[k++] = a[i++];
                }
            }

            for(k=left;k<=right;k++){
                a[k] = ans[k];
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

public class App {

   static void reverceArray(int arr[],int start,int end){
        while( start < end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

     public static void main(String[] args){
        int arr[] = {1,2,3,5,8,9,10};
        int n=arr.length;

        for(int k=0;k<n;k++)
        System.out.print(arr[k]+" ");

        reverceArray(arr, 0, n-1);

        System.out.println("\nReverce array");
        for(int k=0;k<n;k++)
        System.out.print(arr[k]+" ");

    }
}

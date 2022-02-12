import java.util.Arrays;

public class App {

    //This Algo only work with Sorted Arrays
    public static void main(String[] args) throws Exception {
        int arr[]= {10, 20, 80, 30, 60, 50, 
            110, 100, 130};
            int x=110;

            int result = BinarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result);
    }

    static int BinarySearch(int a[],int x){
        int low=0;
        int high= a.length-1;
        Arrays.sort(a);
        while( low <= high){
        int mid = (low+(high - low)/2);
        if(a[mid] == x)return mid;
        // If x greater, ignore left half
        if(a[mid] < x){
            low=mid+1;
        }
        // If x is smaller, ignore right half
        else{
            high=mid-1;
        }
        }
        // if we reach here, then element was
        // not present
        return -1;
    }
}

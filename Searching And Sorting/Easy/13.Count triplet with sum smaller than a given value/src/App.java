import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println(countTriplets(arr,size, sum));
        sc.close();
    }

    static int countTriplets(int arr[], int n,int sum)
    {
        Arrays.sort(arr);
        
        int tripletCount = 0;
        
        for(int i=0;i<n-2 ;i++){
            
            int start = i+1;
            int end = n-1;
            
            while( start < end){
                int tripletSum  = arr[i] + arr[start] + arr[end];
                
                if( tripletSum  < sum){
                    tripletCount += (end - start);
                    start++;
                }else{
                    end--;
                }
            }
        }
        System.out.println("Total no. of triplets: " + tripletCount);
        return tripletCount;
    }
}

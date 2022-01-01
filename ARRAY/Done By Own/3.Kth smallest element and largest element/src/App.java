import java.util.*;

public class App{

    //Its time complexity is in nlogn
    static int K_maxElement(int a[],int n,int k){
        Arrays.sort(a);

        return a[n-k];
    }
    
    static int K_minElement(int a[],int n,int k){
        Arrays.sort(a);

        return a[k-1];
    }


    public static int kthSmallestElementInGivenArrayMaxHeap(int[] arr, int k) {
        if(arr.length < k) {
          System.out.println("Invalid Case");
          return -1;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < k; i++) {
          maxHeap.add(arr[i]);
        }
        
        for(int i = k; i < arr.length; i++) {
          if(arr[i] < maxHeap.peek()) {
            maxHeap.poll();
            maxHeap.add(arr[i]);
          }  
        }
        
        return maxHeap.peek();
      }
      
      public static int kthSmallestElementInGivenArrayMinHeap(int[] arr, int k) {
        if(arr.length < k) {
          System.out.println("Invalid Case");
          return -1;
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < arr.length; i++) {
          minHeap.add(arr[i]);
        }
        
        for(int i = 0; i < k - 1; i++) {
          minHeap.poll();  
        }
        
        return minHeap.peek();
      }
      


      //K-th Max Number
      
      public static int kthLargestElementInGivenArrayMinHeap(int[] arr, int k) {
        if(arr.length < k) {
          System.out.println("Invalid Case");
          return -1;
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < k; i++) {
          minHeap.add(arr[i]);
        }
        
        for(int i = k; i < arr.length; i++) {
          if(arr[i] > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(arr[i]);
          }  
        }
        
        return minHeap.peek();
      }

      public static int kthLargestElementInGivenArrayMaxHeap(int[] arr, int k) {
        if(arr.length < k) {
          System.out.println("Invalid Case");
          return -1;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < arr.length; i++) {
          maxHeap.add(arr[i]);
        }
        
        for(int i = 0; i < k - 1; i++) {
          maxHeap.poll();  
        }
        
        return maxHeap.peek();
      }

    public static void main(String[] args)  {
    //     int ar[] ={ 20,30,10,80,100,101,02,95};
    //     int n=ar.length;

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of K");
    //    //int k=sc.nextInt();
        
    //     sc.close();
    //     System.out.println(K_maxElement(ar, n, k));
    //     System.out.println(K_minElement(ar, n, k));


        int[] arr = {10, 7, 11, 30, 20, 38, 2, 45};
        int k = 2;
    
    System.out.println(kthSmallestElementInGivenArrayMaxHeap(arr, k));
    System.out.println(kthSmallestElementInGivenArrayMinHeap(arr, k));
    System.out.println(kthLargestElementInGivenArrayMinHeap(arr, k));
    System.out.println(kthLargestElementInGivenArrayMaxHeap(arr, k));
    }
}

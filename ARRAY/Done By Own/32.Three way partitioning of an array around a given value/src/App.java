public class App {

    public static void threeWayPartition(int array[], int a, int b)
    {
        int  n = array.length;
         
        // Initialize ext available positions for
        // smaller (than range) and greater lements
        int start = 0, end = n-1;
         
         // Traverse elements from left
        for(int i = 0; i <= end;)
        {
             
            // If current element is smaller than
            // range, put it on next available smaller
            // position.
             
            if(array[i] < a)
            {
                 
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
                i++;
                 
            }
             
            // If current element is greater than
            // range, put it on next available greater
            // position.
            else if(array[i] > b)
            {
                 
                int temp = array[end];
                array[end] = array[i];
                array[i] = temp;
                end--;
                  
            }
             
            else
              i++;
        }
    }
    public static void main(String[] args) throws Exception {
        
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
         
        threeWayPartition(arr, 10, 20);
  
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
     
        }   
    }
}

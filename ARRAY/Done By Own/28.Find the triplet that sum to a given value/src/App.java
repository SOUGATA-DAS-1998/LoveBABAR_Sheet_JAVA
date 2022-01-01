import java.util.*;
public class App {

    public static boolean find3Numbers(int A[], int n, int X) { 
    
        // Your code Here
        
        Arrays.sort(A);
        
        for(int i=0;i<n;i++){
            
            int l=i+1;
            int r=n-1;
            
            while(l < r){
                
                if(A[i] + A[l] + A[r] == X){
                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    return true;
                }
                
                else if(A[i] + A[l] + A[r] < X) l++;
               
                else r--;
            }
        }

     return false;
     }
    public static void main(String[] args) throws Exception {
        int n = 6, X = 130;
      int  arr[] = {1, 4, 45, 6, 10, 8};

      //find3Numbers(arr, n, X);

      if(find3Numbers(arr, n, X) == true){
          System.out.println("");
      }else{
          System.out.println("No Triplet Found");
      }
    }
}

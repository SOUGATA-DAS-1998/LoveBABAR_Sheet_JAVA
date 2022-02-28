
//Ref:  https://www.youtube.com/watch?v=okP-e2VpI_g


/* 
Input:
5
5 10 30 20 15
3
Output:
Job will completed at: 35
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] boards = new int[size];
        for (int i = 0; i < size; i++) {
            boards[i] = sc.nextInt();
        }
        int painters = sc.nextInt();
        findPages(boards, size,painters);
        sc.close();
    }


    //Function to find minimum number of pages.
    public static void findPages(int[]A,int N,int M)
    {
        //Your code here
        int sum=0,ans=0,max=0;
        
        for(int val:A){
            sum +=val;
            max=Math.max(max,val);
        }
        
        int low=max;
        int high=sum;
        
        while( low <= high){
            int mid =(low+high)/2;
            
            if(possiblePages(A,mid,M)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        System.out.println("Job will completed at: " + ans);
    }
    
    
    public static boolean possiblePages(int arr[],int mid,int student){
        int numberStu = 1;
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            
            if(sum > mid){
                numberStu++;
                sum = arr[i];
            }
        }
         return numberStu <= student;
    }
}

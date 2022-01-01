public class App {

    //Ref: https://www.youtube.com/watch?v=5Du2iSRrbEw

    //Below solutin is of O(n) time

    public static int minjumps(int arr[],int n){

        int maxRechable = arr[0];
        int jumps=0;
        int stepsPossible = arr[0];

        if(n == 1) return arr[0];

        for(int i=0;i<n;i++){

            if(arr[0] == 0)return -1;

           // maxRechable = Math.max(maxRechable, i+arr[i]);
            maxRechable = Math.max(maxRechable, i+arr[i]);
            stepsPossible--;

            if(stepsPossible == 0){
                jumps++;
                if(i >= maxRechable)return -1;
                stepsPossible = maxRechable - i;
            }
        }
        return jumps;

    }
    public static void main(String[] args) throws Exception {
        
        // int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr1[] = {2,3,1,1,2,4,2,0,1,1};
        int N = arr1.length; 


       System.out.println(minjumps(arr1, N));
    }
}

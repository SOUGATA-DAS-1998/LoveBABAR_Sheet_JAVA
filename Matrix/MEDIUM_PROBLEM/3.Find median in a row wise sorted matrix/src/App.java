public class App {
    
    //Ref: https://www.youtube.com/watch?v=tFdBRcHLSGQ&t=953s

    
    public static void median(int[][] mat, int row, int col) {
        int startVal = 0, endVal = 2000, midVal;
        int n = row*col;
        while(startVal <= endVal){
            midVal = (endVal+startVal)/2;
            int ans = 0;
            for(int i = 0; i<row; i++){
                int l = 0, h = col-1;
                while(l <= h){
                    int m = l+(h-l)/2;
                    if(mat[i][m] <= midVal)
                        l = m+1;
                    else
                        h = m-1;
                }
                ans += l;
            }
            if(ans <= n/2)
                startVal = midVal+1;
            else
                endVal = midVal-1;
        }
        System.out.println("The median is " + startVal);
    }
    public static void main(String[] args) throws Exception {
        
      int  R = 3, C = 3;
      int M[][] = {{1, 3, 5}, 
                     {2, 6, 9}, 
                     {3, 6, 9}};

                     median(M,R,C);
    }
}

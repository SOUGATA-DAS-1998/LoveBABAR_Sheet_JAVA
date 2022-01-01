public class App {

    //Ref: https://www.youtube.com/watch?v=cWKLH1BDsIg

  static  int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int omax=0;
        int r=-1;
        
        for(int i=0;i<n;i++){
            int coir = binarySearch(arr,i); // Count of 1's in the i'th row
            
            if(coir > omax){
                omax = coir;
                r = i;
            }
        }
        return r;
        
    }
    
   static int binarySearch(int m[][],int r){
        int l=0;
        int h= m[0].length - 1;
        int f_i = m[0].length;
        
        while( l <= h){
            int mid = (l+h) / 2;
            
            if(m[r][mid] == 1){
                f_i = mid;
                h = mid-1;
            }
            else{
                l = mid + 1;
            }
        }
        int count = m[0].length - f_i;
        return count;
    }

    public static void main(String[] args) throws Exception {
        

        int N = 4 , M = 4;
        int Arr[][] = {{0, 1, 1, 1},
                       {0, 0, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};

       System.out.println(rowWithMax1s(Arr, N, M));
    }
}

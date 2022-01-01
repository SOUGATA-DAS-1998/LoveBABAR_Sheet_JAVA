import java.util.PriorityQueue;

public class App {

    public static int kthSmallest(int[][]mat,int n,int k)
	{

        //By Using min Heap
        //code here.
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                q.add(mat[i][j]);
            }
        }
        
        for(int i=0;i<k-1;i++){
            q.poll();
        }
        
        return q.peek();
    }
    public static void main(String[] args) throws Exception {
        

      int  N = 4;
      int mat[][] =     {{16, 28, 60, 64},
                          {22, 41, 63, 91},
                          {27, 50, 87, 93},
                          {36, 78, 87, 94 }};

                         System.out.println( kthSmallest(mat, N, 3) );
    }
}

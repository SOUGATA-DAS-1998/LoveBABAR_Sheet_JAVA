import java.util.Arrays;

public class App {
    static int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int ans[] = new int[N*N];
        int k=0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                ans[k++] = Mat[i][j];
            }
        }
        Arrays.sort(ans);
        k=0;
         for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j] = ans[k++];
            }
        }
        return Mat;
    }
    public static void main(String[] args) throws Exception {
        int N=4;
       int Mat[][]={{10,20,30,40},
                    {15,25,35,45}, 
                    {27,29,37,48}, 
                    {32,33,39,50}};

            sortedMatrix(N, Mat);

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(Mat[i][j]+" ");

                }
                System.out.println();

            }
    }
}

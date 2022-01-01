import java.util.Arrays;
//import java.util.Scanner;


//REf: https://www.youtube. com/watch?v=50nn3bA1BT4
public class App {
    
    public static int Chocolate_Find(int a[],int n,int M){
        int ans=Integer.MAX_VALUE;

        Arrays.sort(a);

        for(int i=0; i<=n-M;i++){
            int minw=a[i];
            int maxw=a[i+ M-1];

            int gap= maxw - minw;

            if( gap < ans){
                ans=gap;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        int n=8;
        int m=5;
        int arr[]= {3, 4, 1, 9, 56, 7, 9, 12};

        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

       System.out.println( Chocolate_Find(arr, n, m));

       // sc.close();
    }
}

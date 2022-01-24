import java.util.*;
//Ref : https://www.youtube.com/watch?v=YHSjvswCXC8&t=614s
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int dp[][] = new int[n][n];

        //gap techniq
        for(int g=0; g<n; g++){
            for(int i=0, j=g; j<n;i++,j++){
                if(g == 0){
                    dp[i][j] = 1;
                }else if(g == 1){
                    dp[i][j] = str.charAt(i) == str.charAt(j) ? 3:2;
                }else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1;
                    }else{
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
                    }
                }
            }
        }
        System.out.println(dp[0][n-1]);
        sc.close();
    }

    

}

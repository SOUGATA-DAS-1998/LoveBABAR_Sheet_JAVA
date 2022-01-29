import java.util.Scanner;
//Ref: https://www.youtube.com/watch?v=WhMbbnHZpis
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Number of swaps require is "+minimumNumberOfSwaps(str));
        sc.close();
    }

    static int minimumNumberOfSwaps(String S){
        int open=0,close=0,unbalanced=0,swap=0;
        
        for(int i=0;i<S.length();i++ ){
            
            if(S.charAt(i) == '[' ) 
            {
                open++;
            
            if(unbalanced > 0){
                swap +=unbalanced;
                unbalanced--;
            }
            
            }else{
                close++;
                unbalanced = close - open;
            }
        }
        return swap;
    }
}

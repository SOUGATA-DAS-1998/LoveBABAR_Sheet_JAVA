import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        minFlips(str);
        sc.close();
    }
    public static void minFlips(String S) {
        // Code here
        int cev=0,cod=0;
        for(int i=0;i<S.length();i++){
            if( i % 2 == 0){
                if(S.charAt(i) == '1'){
                    cev++;
                }else{
                    cod++;
                }
             }else{
                 if(S.charAt(i) == '0'){
                     cev++;
                 }else{
                     cod++;
                 }
             }
        }
        System.out.println("Min flips require: " + Math.min(cev, cod));
    }
}

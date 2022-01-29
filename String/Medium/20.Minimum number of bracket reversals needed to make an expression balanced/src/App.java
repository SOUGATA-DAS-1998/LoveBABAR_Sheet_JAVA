import java.util.*;
//Ref : https://www.youtube.com/watch?v=dTBpH9YT2HQ&t=569s

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countRev(str);
        sc.close();
    }

    static void countRev(String s){
        if(s.length() % 2 == 0){

            int open=0,close=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '{') open++;
                else{
                    if(open == 0) close++;
                    else open--;
                }
            }
            int res = (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
        System.out.println("Minimum reversal reuired: " + res);
        }else{
            System.out.println("Not Possible");
        }
    }
}

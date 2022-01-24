import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSequence(str);
        sc.close();
    }
    static void printSequence(String s){
        String[] dialPad = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String ans="";
        for(char c:s.toCharArray()){
            if(c == ' '){
                ans +='0';
            }else{
                ans += dialPad[c - 'A'];
            }
        }
        System.out.println(ans);
    }
}

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        ArrayList<String> res = gss(str);
        System.out.println(res);
        sc.close();
    }
    //bc --> [--,-c,b-,bc]
    //abc -->[---,--c,-b-,-bc,a--,a-c,ab-,abc]
    public static ArrayList<String> gss(String s){

        if(s.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        
        char ch = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new  ArrayList<String>();
        for(String rstr: rres){

            mres.add(""+ rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }
}

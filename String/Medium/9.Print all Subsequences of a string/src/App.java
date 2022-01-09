import java.util.*;

//Ref: https://www.youtube.com/watch?v=Ke8TPhHdHMw&t=493s
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        Pss(str, "");
        sc.close();
    }

    public static void Pss(String ques,String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch=ques.charAt(0);
        String roq= ques.substring(1); //roq= rest of question

        Pss(roq, ans + ch);
        Pss(roq, ans + "");
    }
}

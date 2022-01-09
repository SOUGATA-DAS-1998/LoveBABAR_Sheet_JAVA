import java.util.*;

/* 
the Permutation of a given string of size n= n!
 the string of size 3 is having 3! =  6 permutation.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("The permutation of the string is");;
        PermutationALLString(str, "");
        sc.close();
    }

    //Recursion Substring

    //Ref: https://www.youtube.com/watch?v=sPAT_DbvDj0

    public static void PermutationALLString(String ques,String ans){

        if(ques.length() == 0){
            System.out.println(ans);
        }
        
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i); // from starting to till the ith position 
            String s2=ques.substring(i+1);//from i+1 position to the rest of the string
            String roq=s1+s2;      //roq = rest of String
            PermutationALLString(roq, ans+ch);
        } 
    }
}

//Iterative solution is done below ..need to understand more


//https://www.youtube.com/watch?v=39SKIuA-ieY
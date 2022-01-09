import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPar(str))
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
        sc.close();
    }

    //Function to check if brackets are balanced or not.
    static boolean isPar(String x)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
                continue;
            }
            
            if(s.isEmpty()){
                return false;
            }
            
            if(c == ')'){
                if(s.peek() == '(' ){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
             if(c == '}'){
                if(s.peek() == '{' ){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
             if(c == ']'){
                if(s.peek() == '[' ){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
        }
        if( !s.isEmpty() ){
            return false; 
        }
        return true;
    }
}

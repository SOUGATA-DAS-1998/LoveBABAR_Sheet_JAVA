public class App {

    String reverce(String s){
        char ans[] = s.toCharArray();
        int i=0,j=ans.length-1;
        while(i < j ){
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            
            i++;
            j--;
        }
        s=String.valueOf(ans);
        return s;
    }
   int isPalindrome(String S) {
       // code here
       String ans = "";
       
       ans = reverce(S);
       
       if(ans.equals(S))
       return 1;
       
       return 0;
       
   }
    public static void main(String[] args) throws Exception {
        
    }
}

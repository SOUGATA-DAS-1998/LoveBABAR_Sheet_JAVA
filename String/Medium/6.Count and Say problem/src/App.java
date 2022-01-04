import java.util.*;

//REf: https://www.youtube.com/watch?v=VlrgwAWL3vE
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(CountandSay(N));
        sc.close();
    }

    static String CountandSay(int n){

        if(n <= 0)return null;

        String result="1";
        int i=1;
        while( i < n){
            StringBuffer sb = new StringBuffer();
            int count=1;
            for(int j=1;j<result.length();j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count=1;

                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            i++;
            result=sb.toString(); //this toString function is important
        }
        return result;
    }

}

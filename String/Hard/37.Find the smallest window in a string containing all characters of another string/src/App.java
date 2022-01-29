/* Ref: https://www.youtube.com/watch?v=e1HlptlipB0 */

/* 
Test:
I/P - 
dbaecbbabdcaafbddcabgba
abbcdc

O/P - Smallest window: cbbabdc
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(smallestWindow(str1, str2));
        sc.close();
    }


    public static String smallestWindow(String s, String p)
    {
        // Your code here
        String ans="";
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(char c: p.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int mct=0; //match count
        int dmct=p.length(); // desiered match count
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        int i=-1;
        int j=-1;
        
        while(true){
            boolean f1=false;
            boolean f2=false;
            //acuire
            while( i < s.length()-1 && mct < dmct ){
                i++;
                char ch=s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                
                if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0)){
                    mct++;
                }
                f1=true;
            }
            
            // Collect answer and release
            
            while( j < i && mct == dmct){
                String pans= s.substring(j+1,i+1);
                if(ans.length() == 0 || pans.length() < ans.length() ){
                    ans = pans;
                }
                
                //releasing
                j++;
                char ch= s.charAt(j);
                if(map1.get(ch) == 1 ){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1 );
                }
                
                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch,0) ){
                    mct--;
                }
                f2=true;
            }
            if(!f1 && !f2)break;
        }
        
        if(ans == "")return "-1";
        
        return ans;
    }
}
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

       // substring0_1(s);
       System.out.println(maxSubStr(s,s.length()));
        sc.close();
        
    }

    // public static void substring0_1(String str){
        
    //     int ans=0;
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     map.put(0,1);
    //     int sum=0;

    //     for(char c:str.toCharArray()){
    //         if(c == '0'){
    //             sum += -1;
    //         }else{
    //             sum +=1;
    //         }

    //         if(map.containsKey(sum)){
    //             ans++;
    //             map.put(sum,map.get(sum)+1);
    //         }else{
    //             map.put(sum,1);
    //         }
    //     }
    //     System.out.println("The number of substrings: " + ans/2);
    // }


    static int maxSubStr(String str, int n)
    {
     
        // To store the count of 0s and 1s
        int x = 0, y = 0;
     
        // To store the count of maximum
        // substrings str can be divided into
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) == '0')
            {
                x++;
            }
            else
            {
                y++;
            }
            if (x == y)
            {
                cnt++;
            }
        }
     
        // It is not possible to
        // split the string
        if (x != y)
        {
            return -1;
        }
        return cnt;
    }
}

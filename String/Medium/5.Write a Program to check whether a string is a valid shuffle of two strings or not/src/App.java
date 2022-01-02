import java.util.*;
public class App {
    //REF: https://www.youtube.com/watch?v=qN_vwYtvFUM
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String Str=sc.nextLine();
        String S1=sc.nextLine();
        String S2=sc.nextLine();

        //if(shuffleString(Str, S1, S2))
        if(shuffleCheck(Str, S1, S2))
        System.out.println(Str + " is a valid shuffle of " + S1 + " and " + S2);
        else
            System.out.println(Str + " is not a valid shuffle of " + S1 + " and " + S2);
        
        sc.close();


    }

    // By using two pointer algo

    static boolean shuffleString(String str,String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int r=str.length();

        int i=0,j=0,k=0;
        if((l1+l2) != r) return false;
        else{
        while(k < r){
            if(i<l1 && s1.charAt(i) == str.charAt(k)) i++;
            else if(j<l2 && s2.charAt(j) == str.charAt(k))j++;
            else{
                break;
            }
            k++;
        }

        if(i < l1 && j<l2)
        return false;
        return true;
    }

    }


    // BY USing HashMap

    static boolean shuffleCheck(String str, String s1, String s2) {

        if (str.length() != s1.length() + s2.length())
            return false;
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char c : str.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        for (char c : s1.toCharArray()) {
            if (hash.containsKey(c)) {
                if (hash.get(c) > 1)
                    hash.put(c, hash.get(c) - 1);
                else
                    hash.remove(c);
            }
            else
                return false;
        }

        for (char c : s2.toCharArray()) {
            if (hash.containsKey(c)) {
                if (hash.get(c) > 1)
                    hash.put(c, hash.get(c) - 1);
                else
                    hash.remove(c);
            }
            else
                return false;
        }

        if (hash.isEmpty())
            return true;
        return false;
    }
}

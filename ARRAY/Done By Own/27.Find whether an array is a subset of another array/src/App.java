


import java.util.*;
public class App {


    public static String isSubset( int a1[], int a2[]) {
        
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int val: a1 ){
            set.add(val);
        }
        
        for(int val2: a2 ){
            if(!set.contains(val2) )
            return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) throws Exception {
       int  a1[] = {10, 5, 2, 23, 19};
        int a2[] = {19, 5, 23};

       System.out.println( isSubset(a1, a2) );
    }
}

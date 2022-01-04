import java.util.*;

/* Ref: https://www.youtube.com/watch?v=jCOJk4UyO8w */

/* 
Test:
I/P - aaaabbaa O/P - aabbaa
I/P - abc O/P - a
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        longestPalim(str);


        sc.close();

    }

    public static void longestPalim(String s){
        int l,h,start=0,end=1;

        for(int i=1;i<s.length();i++){

            //For Even String
            l=i-1;
            h=i;
            // Finding two characters that are equal
            while(l >=0 && h < s.length() && s.charAt(l) == s.charAt(h)){

                 // New string is bigger than previous one
                 if(h-l+1 > end){
                     start = l;
                     end = h-l+1;
                 }
                   // Traversing to the ends
                l--;
                h++;
            }

            //For Odd String
            l=i-1;
            h=i+1;

            while(l >=0 && h < s.length() && s.charAt(l) == s.charAt(h)){
                if(h-l+1 > end){
                    start = l;
                    end = h-l+1;
                }

                l--;
                h++;
            }
        }
        System.out.println(s.substring(start, start + end));
    }
}

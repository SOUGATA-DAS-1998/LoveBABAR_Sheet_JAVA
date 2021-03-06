/* Ref: https://www.youtube.com/watch?v=QlaDyZTCAbM */

// Code in leetCode :https://leetcode.com/problems/merge-intervals/



import java.util.*;

class Pair implements Comparable<Pair>{
    int a;
    int b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int compareTo(Pair other){
        if(this.a == other.a){
            return this.a - other.a;
        }
        else{
            return this.b - other.b;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Pair p1 = new Pair(1, 4);
        Pair p2 = new Pair(4, 5);
        Pair p3 = new Pair(8, 10);
        Pair p4 = new Pair(15, 18);

        Pair[] pairs = {p1, p2, p3, p4};

        Arrays.sort(pairs);
        Stack<Pair> s = new Stack<>();

        // for (Pair i : pairs) {
        //     if(s.isEmpty() || s.peek().b < i.a)
        //         s.push(i);
        //     else{
        //         s.peek().b = i.b;
        //     }
        // }

        // for (Pair i : s) {
        //     System.out.println(i.a + " , " + i.b);
        // }
        for(int i=0;i<pairs.length;i++){
            if(i == 0){
                s.push(pairs[i]);
            }
            else{
                Pair top = s.peek();

                if(top.b < pairs[i].a){
                    s.push(pairs[i]);
                }else{
                    top.b = Math.max(top.b , pairs[i].b);
                }
            }
        }
        Stack<Pair> ans = new Stack<>();

        while(s.size() > 0){
            ans.push(s.pop());
        }

        while(ans.size() > 0){
            Pair p = ans.pop();
            System.out.println(p.a +","+ p.b);
        }
    }
}
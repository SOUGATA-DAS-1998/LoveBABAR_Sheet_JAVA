import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        int arr[]={3, 1, 2, 2, 1, 2, 3, 3};
        int n=arr.length;
        int k=4;
        int X=n/k;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val: arr){
            map.put(val,map.getOrDefault(1, 0)+1);
        }

        // for(int ans: map.keySet()){
        //     if(map.get(ans) > X){
        //         System.out.println(ans) ;
        //     }
        // }

        for (Map.Entry<Integer,Integer> m : map.entrySet())
        {
            Integer temp = (Integer)m.getValue();
            if (temp > X)
                System.out.println(m.getKey());
        }
       
    }
}

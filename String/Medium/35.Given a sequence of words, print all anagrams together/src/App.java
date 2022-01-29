/* Ref: https://www.youtube.com/watch?v=NNBQik4phMI */
/*
I/p = 5
      act
      god
      cat
      dog
      tac 

O/P = [[act, cat, tac], [god, dog]]

*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = sc.next();
        }
        System.out.println(Anagrams(words));


        sc.close();
    }
    public static List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<HashMap<Character,Integer>,ArrayList<String>> hash = new HashMap<>();
        
        for(String s:string_list){
            HashMap<Character,Integer> map = new HashMap<>();
            for(char c: s.toCharArray() ){
                map.put(c,map.getOrDefault(c,0)+1 );
            }
            
            if(hash.containsKey(map)){
                ArrayList<String> arr = hash.get(map);
                arr.add(s);
                 hash.put(map, arr);
            } else {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(s);
                hash.put(map, arr);
            }
        }
        
         List<List<String>> res = new ArrayList<>();
        for (ArrayList<String> h : hash.values()){
            res.add(h);
        }
         return res;
    }
}
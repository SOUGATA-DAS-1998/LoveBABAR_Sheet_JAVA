import java.util.*;
public class App {

    static void DupliCharc(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        /*Print duplicates in sorted order*/
        for(Map.Entry<Character,Integer> mapElement : map.entrySet()){
            char key = (char)mapElement.getKey();
            int value =(int)mapElement.getValue();

           // if (value > 1)
            System.out.println(key
                               + ", count = " + value);
        }
    }
    public static void main(String[] args) throws Exception {
        String str="aabbbcdeerfrgt";

        DupliCharc(str);
    }
}

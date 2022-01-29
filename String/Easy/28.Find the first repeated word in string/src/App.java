import java.util.*;
//REF : https://www.youtube.com/watch?v=xVs5FvwMDso
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
        secFrequent(str);
        sc.close();
    }

    static void secFrequent(String arr[]){

        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        
        int f_max=Integer.MIN_VALUE,s_max=Integer.MIN_VALUE;
        String key="";
        int value=0;
        
        for(Map.Entry<String,Integer> mapEle : map.entrySet()){
            key = (String)mapEle.getKey(); //Object cannot be converted to String error if not typeCasted to String
            value = (int)mapEle.getValue();// Object cannot be converted to int error if not typeCasted to Integer
            
            if(value > f_max){
                s_max = f_max;
                f_max = value;
            }else if( value > s_max && value < f_max){
                s_max = value;
            }
        }
        
        for(Map.Entry<String,Integer> mapEle : map.entrySet()){
            key =(String) mapEle.getKey();
            value =(int) mapEle.getValue();
            
            if(value == s_max) System.out.println("The second word is "+ key);
        }
    
    
    }
}
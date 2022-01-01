import java.util.*;


public class App {

    public static int findDuplicate(int[] nums) {
        
       // int n=nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // for(int i=0;i<n;i++){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1);
        //     }else{
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        // }

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int x:map.keySet()){
            if(map.get(x) > 1)return x;
        }
    return 0;
    }

    
    
    

    public static void main(String[] args){
       int ar[]={1,2,3,1,2,5,1,2};
     
        

      
      System.out.println( findDuplicate(ar));
      
    

        
        
    }
}

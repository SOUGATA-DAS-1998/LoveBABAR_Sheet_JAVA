import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println("Number of subArray "+ findSubarray(arr,size));
        sc.close();
    }
    public static int findSubarray(int[] arr ,int n) 
    {
        //Your code here
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0, 1);
        int i =-1;
        int sum=0;
        int count = 0;
        
        while( i < n-1){
            i++;
            
            sum +=arr[i];
            
            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum,map.get(sum)+1 );
            }else{
                map.put(sum,1);
            }
        }
        
        
        return count;
        
    }
}

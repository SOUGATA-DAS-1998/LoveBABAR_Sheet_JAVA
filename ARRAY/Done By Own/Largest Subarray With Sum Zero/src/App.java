import java.util.*;
public class App {

    //Ref: https://www.youtube.com/watch?v=xmguZ6GbatA&t=722s

    static int maxLen(int A[],int n){
    int sum=0;
    int max=0;
    
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<n;i++){
        sum +=A[i];
        if(sum == 0){
            max = i+1;
        }else{
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
    }
    return max;
    }
    public static void main(String[] args) throws Exception {
    
        int arr[]={4, 2, -3, 1, 8};
        int n=arr.length;

        System.out.println(maxLen(arr, n));
    }
}

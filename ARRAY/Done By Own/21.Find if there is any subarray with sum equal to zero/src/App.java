import java.util.*;
public class App {

    static boolean findsum(int arr[],int n)
    {
        //Your code here

        //Ref: https://www.youtube.com/watch?v=QtbFXZrEZYc&t=639s
        int s=0;
        HashMap<Integer,Integer> num = new HashMap<>();
        
        for(int i=0;i<n;i++){
            s += arr[i];
            
            if(s == 0 || num.containsKey(s) || arr[i]==0)
            return true;
            else{
                num.put(s,1);
            }
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        
        int arr[]={4, 2, -3, 1, 8};
        int n=arr.length;

        if(findsum(arr, n) == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}

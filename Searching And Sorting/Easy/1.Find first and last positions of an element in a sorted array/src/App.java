import java.util.ArrayList;
//Ref:https://www.youtube.com/watch?v=Y7LiLNdayF0
public class App {
    public static void main(String[] args) throws Exception {
        int arr[]={ 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x=5;
        int n=arr.length;
        System.out.println(find(arr, n, x));
    }
    static ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        int lo=0;
        int hi=n-1;
        int ans=-1;
        //to find first index
        while(lo <= hi){
            int mid = (lo+hi) /2;
            //
            if(arr[mid] == x){
                ans=mid;
                //continue Searching left part
                hi=mid-1;
            }
             if(arr[mid] < x){
                lo=mid+1;
            
            }else{
                hi=mid-1;
            }
        }
        a.add(ans);
          lo=0;
         hi=n-1;
         ans=-1;
        //to find second index
        while(lo <= hi){
            int mid = (lo+hi) /2;
            //
            if(arr[mid] == x){
                ans=mid;
                //continue Searching right part
                lo=mid+1;
            }
            else if(arr[mid] < x){
                lo=mid+1;
            
            }else{
                hi=mid-1;
            }
        }
        a.add(ans);
        return a;
    }
}


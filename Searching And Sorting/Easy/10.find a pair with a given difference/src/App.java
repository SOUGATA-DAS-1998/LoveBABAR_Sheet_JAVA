import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       int k = 78;
       int arr[] = {5, 20, 3, 2, 5, 80};

       Arrays.sort(arr);
       int i=0,j=1;

       while(i <arr.length && j<arr.length ){
           if((arr[j] - arr[i]) == k){
               System.out.println("The Pair element is "+arr[i]+" And "+arr[j]+ " Whose differnece is "+k);
               return;
           }else if((arr[j] - arr[i]) < k){
               j++;
           }else{
               i++;
           }
       }
       System.out.println("No pair found");
    }
}

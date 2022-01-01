public class App {

    public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<n;i++){
                      if(isPalim(a[i]) == 0)
                      return 0;
                  }
                  return 1;
           }
           
          static int isPalim(int n){
               int x=n,rem=0;
               
               while(x > 0){
                   rem= rem*10+ x%10;
                   x=x/10;
               }
               if(n==rem) return 1;
               
               return 0;
           }
    public static void main(String[] args) throws Exception {
        
        int arr[]={111, 222, 333, 444, 555}; 
        int arr2[]={111, 222,30}; 
        int n=arr.length;
        int n2=arr.length;

        System.out.println(palinArray(arr, n));
        System.out.println(palinArray(arr2, n2));
    }
}

public class App {
//ref: https://www.youtube.com/watch?v=21tQXPbGg7k&t=474s
    public static void smallestSubArray(int[] arr,int n,int x){
        int sum=arr[0];
        int minlen = Integer.MAX_VALUE;
        int i=0,j=1;

        while(j < n){
            if(sum > x){
                minlen = Math.min(minlen,j-i);
                sum -=arr[i++];
            }else{
                sum +=arr[j++];
            }
        }

        if(minlen == Integer.MAX_VALUE)
            System.out.println("Not Found");
        else
                System.out.println("Minimum sub-array length is "+ minlen);
    }


    public static void main(String[] args) throws Exception {
        int a[]={1,4,45,6,0,19};
        int n=a.length;
        int x=51;

        smallestSubArray(a, n, x);
    }
}

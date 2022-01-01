public class App {

    //Ref: https://www.youtube.com/watch?v=xZed_DXZNoU

    //More Optimised code 
    //Ref: https://www.youtube.com/watch?v=jDJuW7tSxio

    public static int medianOfTwoSortedArray(int a1[],int a2[],int n1,int n2){

        int nfinal= n1 + n2;
        int ans[]= new int[nfinal];

        int i=0,j=0,k=0;

        while(i < n1 && j < n2){
            if(a1[i] < a2[j]){
                ans[k++]=a1[i++];
            }else{
                ans[k++] = a2[j++];
            }
        }

        while(i < n1){
            ans[k++]=a1[i++];
        } 
        while(j < n2){
            ans[k++]=a2[j++];
        }


        int mid=nfinal/2;
        int median=0;
        if(nfinal % 2 ==1){
            median = ans[mid];
        }else{
            median = (ans[mid] + ans[mid-1]) / 2;
        }
        return median;
    }
    public static void main(String[] args) throws Exception {
        

        int ar1[] = { 1, 2, 3, 6 };
        int ar2[] = { 4, 6, 8, 10 };
        int n1 = ar1.length;
        int n2 = ar2.length;

       System.out.println(medianOfTwoSortedArray(ar1, ar2, n1, n2));
    }
}

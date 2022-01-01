public class App {

    static void merge(int arr1[],int arr2[],int n,int m){
        int ans[]=new int[n+m];

        int i=0,j=0,k=0;


        while( i < n && j < m){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }else{
                ans[k++]=arr2[j++];
            }
        }

        while(i < n){
            ans[k++] = arr1[i++];
        }
        while(j < m){
            ans[k++] = arr2[j++];
        }

        for(int x=0;x<ans.length;x++) System.out.print(ans[x]+" ");

    }
    public static void main(String[] args) throws Exception {
      int  arr1[] = {1, 3, 5, 7};
      int  arr2[] = {0, 2, 6, 8, 9};
      int n=arr1.length;
      int m=arr2.length;

      merge(arr1, arr2, n, m);
    }
}

public class App {

    static void sort(int a[],int n){
        int a1=0,a2=0,a3=0;

        for(int i=0;i<n;i++) {
        if(a[i] == 0) a1++;
        else if(a[i] == 1) a2++;
        else a3++;
        }
        int k=0;
        for(int i=0;i<a1;i++) a[k++] = 0;
        for(int i=0;i<a2;i++) a[k++] = 1;
        for(int i=0;i<a3;i++) a[k++] = 2;

        
    }
    public static void main(String[] args){
        int arr[] = { 0,1,2,1,2,2,2,0,0,1,0};
        int n=arr.length;

        sort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class App {

    static void MaxMin(int a[],int n){
        int max=a[0],min=a[0];

        for(int i=1;i<n;i++){
            if(max < a[i]) max = a[i];
            if(min > a[i]) min = a[i];
        }
        System.out.println("Maximum= "+max);
        System.out.println("Minimum= "+min);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,50,99,80,05};
        int n=arr.length;

        MaxMin(arr, n);
    }
}

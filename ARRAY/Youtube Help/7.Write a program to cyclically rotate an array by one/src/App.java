public class App {

    public static void reverce(int ar[],int i,int j)
    {
        int temp=0;
        while(i < j){
         temp=ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        i++;
        j--;
        }

    }
    public static void rotate(int a[],int k){
        int n=a.length;
        k= k % n;
        if(k < 0){
            k = k + n;
        }
        
        reverce(a, 0, n-k-1);
        reverce(a, n-k, n-1);
        reverce(a, 0, n-1);
    }

    public static void display(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5,6};
        int n=arr.length;

        rotate(arr, 2);

        display(arr, n);
        
    }
}

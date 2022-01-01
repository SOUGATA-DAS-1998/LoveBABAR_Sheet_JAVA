public class App{

    //Ref : https://www.youtube.com/watch?v=-z9pFUaUsGQ

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void rearange(int a[], int n) {
     int i = 0, j = n-1;

        while (i < j) {
            while (i <= n - 1 && a[i] > 0)
                i++;
            while (j >= 0 && a[j] < 0)
                j--;
            if (i < j)
                swap(a, i, j);
        }

        

        if (i == 0 || i == n)
            return;

        int k = 0;
    
        while (k < n && i < n) {
            swap(a, k, i);
            i = i + 1;
            k = k + 2;
        }
    }

    static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 2, 3, -4, -1, 6, -9 };

        int n = 6;

        rearange(arr, n);
        printArray(arr, n);


    }
}

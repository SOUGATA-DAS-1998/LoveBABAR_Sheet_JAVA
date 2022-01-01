public class App{

    static void swap(int a[],int i,int j){
        int temp= a[i];
        a[i] = a[j];
        a[j] = temp; 
    }

    static void sergregate_Negative(int a[],int n){
        int i=0,j=0;

        while( i < n ){
            if(a[i] < 0) i++;

            else{
                swap(a, i, j);
                i++;
                j++;
            }
        }

        for(int k=0;k<n;k++) 
        System.out.print(a[k]+" ");
    }
    public static void main(String[] args){
        int ar[] = {10,-5,9,70,-8,-1,55,66,11,-45,-20};
        int n=ar.length;

        sergregate_Negative(ar,n);

    }
}

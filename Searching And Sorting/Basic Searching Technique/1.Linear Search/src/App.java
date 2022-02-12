public class App {
    public static void main(String[] args) throws Exception {
        int arr[]= {10, 20, 80, 30, 60, 50, 
            110, 100, 130, 170};
            int x=110;

           if( LinearSearch(arr, x) == -1){
               System.out.println("Not present");
           }else{
               System.out.println("The value "+LinearSearch(arr, x)+"is Present");
           }
    }

    static int LinearSearch(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(a[i] == x){
                return a[i];
            }
        }
        return -1;

    }
}

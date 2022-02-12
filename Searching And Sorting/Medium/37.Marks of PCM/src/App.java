import java.util.*;

/* 
I/P - 10
      4 5 12
      1 2 3 
      10 9 6
      4 6 5 
      4 3 2
      4 10 10
      1 2 16
      10 9 32 
      1 14 10
      10 10 4
      1 14 10
      1 2 3
      1 2 16
      4 10 10
      4 6 5
      4 5 12
      4 3 2
      10 10 4
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
                App ob = new App();
                ob.customSort (phy, chem, math, n);
                System.out.println("The output is");
                for (int i = 0; i < n; ++i)
                    System.out.println(phy[i]+" " + chem[i] + " " + math[i]);
                sc.close();
            }
            

    



    public  class Marks implements Comparable<Marks>{
        int phy,chem,math;
        
        Marks(){
            
        }
        Marks(int phy,int chem,int math){
            this.phy=phy;
            this.chem = chem;
            this.math = math;
        }
        
       public int compareTo(Marks o){
            if(this.phy != o.phy){
                return this.phy - o.phy;
            }else if(this.chem != o.chem){
                return o.chem - this.chem;
            }else{
                return this.math - o.math;
            }
        }
    }

    public void customSort (int phy[], int chem[], int math[], int N)
    {
        // your code here
        Marks []arr = new Marks[N];
        
        //Fill the marks Array
        for(int i=0;i<N;i++){
            arr[i] = new Marks(phy[i],chem[i],math[i]);
        }
        Arrays.sort(arr);
        
        for(int i=0;i<N;i++){
            phy[i] = arr[i].phy;
            chem[i] = arr[i].chem;
            math[i] = arr[i].math;
        }
    }

}

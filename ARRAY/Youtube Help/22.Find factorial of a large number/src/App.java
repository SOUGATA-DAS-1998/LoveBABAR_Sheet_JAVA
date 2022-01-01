

//https://www.youtube.com/watch?v=vxPBrr5x2jk
import java.util.*;
public class App {

    static int fact(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

//     static ArrayList<Integer> factorial(int N){
//         //code here
//          ArrayList<Integer> list = new ArrayList<Integer>();
         
         
//          for(int i=1;i<=N;i++)    {
//         int carry = 0;        
//         int size = list.size();         
//         if(size == 0) list.add(i); 
//         else
//         {
//             for(int j=0;j<size;j++)
//             {
//                 int b = list.get(j)*i + carry;
//                 list.set(j,b%10);
//                 carry = b/10;
//             }
//             while(carry!=0)
//             {
//                 list.add(carry%10);
//                 carry = carry/10;
//             }
//         }
//     }
//     Collections.reverse(list);
// return list;
//     }


static ArrayList<Integer> factorial(int n){
    
    ArrayList<Integer> result =new  ArrayList<>();
    int carry = 0,size=0;
    //Adding 1 to the 0th index
    result.add(0,1);
    //update the size 
    size=1;

    int val=2;
    while( val <= n){

        for(int i=size-1;i>=0;i--){
            //update the value in arrayList
            int temp = result.get(i) * val +carry;

            //Store the last digit at the index and add remaining to the carry
            result.set(i,temp%10);
            //update Carry
            carry = temp / 10 ;
        }
        // insert carry digit by digit to the begining of the ArrayList
        while(carry != 0){
            result.add(0,carry % 10);
            carry = carry /10;
            size++;
        }
        val++;
    }

    return result;

}

    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
    }
}

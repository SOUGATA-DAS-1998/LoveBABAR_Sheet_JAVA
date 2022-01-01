//Best Time to Buy and Sell Stocks - One Transaction Allowed - Dynamic Programming
/*Ref : https://www.youtube.com/watch?v=4YjEHmw1MX0  */


// Best Time to Buy and Sell Stocks - TWO Transaction Allowed - Dynamic Programming
//https://www.youtube.com/watch?v=wuzTpONbd-0

//Only the one transaction code is done here .. two transaction is for advance study


import java.util.*;


public class App {

    public static int maxProfit(int[] prices) {
     
        int lsf = Integer.MAX_VALUE;  // lsf= least so far
        int op = 0;           // Overall Profit
        int pist=0;           //Profit if sold today
        for (int i = 0; i < prices.length; i++) {
          if (prices[i] < lsf) {
            lsf = prices[i];
          }
          
          pist = prices[i] - lsf;
          
          if (pist > op) {
            op = pist;
          }
        }
            return op;
        }
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
         int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));

        sc.close();

    }
}

import java.util.*;
public class App {
    static int findLongestConseqSubseq(int arr[])
	{
	   // add your code here
	   HashMap<Integer,Boolean> map = new HashMap<>();
	   
	   for(int val: arr){
	       map.put(val,true);
	   }
	   
	   for(int val: arr){
	       if(map.containsKey(val - 1) )
	       {
	           map.put(val,false);
	       }
	   }
	   
	  // int msp=0;   //Max Start Point
	   int ml=0;   //Max length
	   for(int val: arr){
	       if(map.get(val) == true ){
	           int tl=1;         //Temporary length
	           int tsp=val;      //temporary start point
	           
	           while(map.containsKey( tsp + tl) ){
	               tl++;
	           }
	           if(tl > ml){
	               //msp = tsp;
	               ml = tl;
	           }
	       }
	   }
	   return ml;
	}
    
    static void findLongestConseqSubseq_Print(int arr[])
	{
	   // add your code here
	   HashMap<Integer,Boolean> map = new HashMap<>();
	   
	   for(int val: arr){
	       map.put(val,true);
	   }
	   
	   for(int val: arr){
	       if(map.containsKey(val - 1) )
	       {
	           map.put(val,false);
	       }
	   }
	   
	   int msp=0;   //Max Start Point
	   int ml=0;   //Max length
	   for(int val: arr){
	       if(map.get(val) == true ){
	           int tl=1;         //Temporary length
	           int tsp=val;      //temporary start point
	           
	           while(map.containsKey( tsp + tl) ){
	               tl++;
	           }
	           if(tl > ml){
	               msp = tsp;
	               ml = tl;
	           }
	       }
	   }
	   for(int i=0;i<ml;i++)
       System.out.print(msp + i+" ");
	}
    public static void main(String[] args) throws Exception {
    
       // int a[]= {2,6,1,9,4,5,3};
       int a1[] = {1,9,3,10,4,20,2};
        
       System.out.println( findLongestConseqSubseq(a1) );
       findLongestConseqSubseq_Print(a1);
     }
}

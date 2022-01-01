import java.util.*;

public class App {
 
  //REf: https://www.youtube.com/watch?v=FEQSlOQa5po
  
  
// Union of two array By Using HashMap
public static int doUnion(int a[], int n, int b[], int m) 
{
    //Your code here
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int i=0;i<n;i++){
        if(!map.containsKey(a[i])){
            map.put(a[i],1);
        }
    }
    
    for(int i=0;i<m;i++){
        if(!map.containsKey(b[i])){
            map.put(b[i],1);
        }
    }
    return map.size();
  }

public static int doUnionU_SET(int a[], int n, int b[], int m) 
{
    //Your code here
    HashSet<Integer> map = new HashSet<>();
    
    for(int i=0;i<n;i++){
        map.add(a[i]);
    }
    
    for(int i=0;i<m;i++){
       map.add(b[i]);
    }
    return map.size();
}


//Intersection of Two sorted array By Using HashSet
    public static int intersectionOfArray(int a[],int n,int b[],int m){
      int count=0;
      HashSet<Integer> s = new HashSet<>();
      for(int i=0;i<n;i++){
        s.add(a[i]);
      } 
      for(int i=0;i<m;i++){
        if(s.contains(b[i])){
          count++;
          s.remove(b[i]);
        }
      }

      return count;
    }
    
    public static void main(String[] args) {
        int arr1[] = {2, 2, 3, 4, 4, 4, 7, 8};
    int arr2[] = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
    
   // List<Integer> finalUnion = new ArrayList<>();
    
    // unionOfTwoSortedArray(arr1, arr2, finalUnion);
    // System.out.println(finalUnion);

   System.out.println( doUnion(arr1, arr1.length, arr2, arr2.length));
   System.out.println("Using hashset");

   System.out.println( doUnionU_SET(arr1, arr1.length, arr2, arr2.length));
   System.out.println("Intersection of the two array");
   System.out.println(intersectionOfArray(arr1, arr1.length, arr2, arr2.length));


 }
}




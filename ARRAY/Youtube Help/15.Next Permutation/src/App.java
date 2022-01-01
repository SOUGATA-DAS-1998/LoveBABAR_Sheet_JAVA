//import java.util.*;

//Different type of array problem......

// Youtube link to understand the below solve problem 
//https://www.youtube.com/watch?v=LuLCLgMElus


public class App {

    public static void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length <= 1)return;
        
        int i=nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        
        if(i >= 0){
            int j=nums.length - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums, i+1, nums.length - 1);

        for(int x:nums)System.out.print(x+" ");
    }
    

    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void reverse(int a[],int i,int j){
        while( i<j ) swap(a,i++,j--);
    }

    public static void main(String[] args) throws Exception {
        
        int arr[] ={1, 2, 3};
        nextPermutation(arr);
    }
}

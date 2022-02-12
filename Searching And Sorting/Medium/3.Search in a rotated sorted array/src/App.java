public class App {

    //REF: https://www.youtube.com/watch?v=1uu3g_uu8O0
    public static void main(String[] args) throws Exception {
       int nums[] = {4,5,6,7,0,1,2} ,target = 0;
        System.out.println(search(nums, target));


    }
    public static int search(int[] nums, int target) {
        
        int lo=0;
        int hi=nums.length-1;
        
        while( lo <= hi){
            int mid = (lo + hi)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[lo] <= nums[mid]){
                //low to mid part is sorted
                if(nums[lo] <= target && nums[mid] > target){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else if(nums[mid] <= nums[hi] ){
                //mid to high part is sorted
                if(nums[mid] < target && nums[hi] >= target){
                    lo = mid+1;
                }else{
                    hi=mid-1;
                } 
            }
                
        }
        return -1;
    }
}

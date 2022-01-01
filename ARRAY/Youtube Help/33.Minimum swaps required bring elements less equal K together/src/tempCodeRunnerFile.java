public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        
        int good=0,bad=0;
        //Counting good values
        for(int i=0;i<n;i++){
            if(arr[i] <= k){
                good++;
            }
        }
        
        //Counting bad values in the current window
        for(int i=0;i<good;i++){
            if(arr[i] > k){
                bad++;
            }
        }
        
        int i=0,j=good, ans=bad;
        
        while(j<n){
            //If the start of the window is bad value then decrement the bad value by 1
            if(arr[i] > k) bad--;
            
            //If the end of the window was bad value then increase the bad value by 1
            if(arr[j] > k) bad++;
            
            //Update ans
            
            ans=Math.min(ans,bad);
            i++;j++;  //Move window by 1
            
        }
        return ans;
    }
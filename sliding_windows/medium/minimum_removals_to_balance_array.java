class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length; 
        Arrays.sort(nums);

        int left = 0; 
        int maxWindow = 0; 

        for(int right = 0; right < n; right++){
            
            //shrink until condition is valid
            while((long) nums[right] > (long) nums[left] * k){
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return n - maxWindow; 
        //if n is max elements and max window is max number of elements you can keep
        // while removing, then n - maxWindow gives you min ele that were removed.
    }
}

/*
1 6 2 9 
1 2 6 9 
min = 1, max = 9, 9/1 = k ? "no" : remove 1, remove 9, removal: 2
min = 2, max = 6, 6/2 = k ? "yes" : return removal: 2
*/

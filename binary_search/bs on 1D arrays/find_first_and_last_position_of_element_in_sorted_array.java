// HINT: find the first occurence and then the last one. 

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target){
        int low = 0, high = nums.length - 1; 
        int ans = -1; 

        while(low <= high){
            int mid = low + (high - low) / 2; 

            if(nums[mid] < target){
                low = mid + 1; 
            } else if (nums[mid] > target){
                high = mid - 1; 
            } else {
                ans = mid; //first occurrence has been recorded
                high = mid - 1; //shrink the window so it only calculates any other possibiltiy of a smaller 
              // element starting from low to mid - 1. (basically, keep searching LEFT)
            }
        }
        return ans; 
    }

    private int findLast(int[] nums, int target){
        int low = 0, high = nums.length - 1; 
        int ans = -1; 

        while(low <= high){
            int mid = low + (high - low) / 2; 

            if(nums[mid] < target){
                low = mid + 1; 
            } else if (nums[mid] > target){
                high = mid - 1; 
            } else {
                ans = mid; 
                low = mid + 1; 
            }
        }
        return ans; 
    }
}

// HINT: an existing variable already fixes the "doesnt exist" problem.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1; 
        
        while(low <= high){
            int mid = low + (high - low) / 2; 
            
            if(nums[mid] > target){
                high = mid - 1;
            } else if (nums[mid] < target){
                //this part fixes the additional index if number doesnt exist problem.
                low = mid + 1;
            } else if (nums[mid] == target){
                return mid;
            }
        }
        return low; 
    }
}


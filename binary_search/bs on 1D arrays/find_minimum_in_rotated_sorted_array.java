// HINT: think about what is sorted and what isnt. 

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length; 
        int low = 0; 
        int high = n - 1; 
      
        while(low < high){
            int mid = low + (high - low) / 2; 

            if(nums[mid] <= nums[high]){ // if right half is sorted, min isnt here
                high = mid; //high now becomes min as this can be the minimum
            } else {
                low = mid + 1; //if right isnt sorted, then min can be here.
            }
        }

        return nums[low];
    }
}

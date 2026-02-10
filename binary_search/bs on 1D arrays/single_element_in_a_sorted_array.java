//HINT: indices. 

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0; 
        int high = nums.length - 1; 

        while(low < high){
            int mid = low + (high - low) / 2; 

            //if the index is odd
            if(mid % 2 == 1){
                mid--;
            } //force it to be even 

            //if it is a perfect pair
            if(nums[mid] == nums[mid + 1]) {
                low = mid + 2; 
            } else {
                high = mid; 
            }
        }

        return nums[low];
    }
}

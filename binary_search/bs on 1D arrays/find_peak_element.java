//HINT: uphill and downhill detection and rollback 

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0; 
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            //we go uphill -> peak is on RIGHT
            if(nums[mid] < nums[mid + 1]){
                low = mid + 1; 
            } else { //we go downhill -> peak is on LEFT
                high = mid; 
            }
        }
        
        //index of peak:
        return low;
    }
}

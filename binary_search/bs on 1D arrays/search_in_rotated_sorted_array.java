// HINT: think about the index upto which the array is sorted.

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return mid; 
            }

            // if the first half is sorted
            if (nums[low] <= nums[mid]) {

                // and if the number is located in the sorted first half
                if (nums[low] <= target && target <= nums[mid]) {
                    // ignore the right half
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else { // if the second half is sorted

                // and if the number is in the second sorted half
                if (nums[mid] < target && target <= nums[high]) {
                    // ignore the left half
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}

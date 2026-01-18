//HINT:
// 1 3 2 2 5 2 3 7 
// 1 2 2 2 3 3 5 7 (if sorted)

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start = 0, maxLen = 0; 

        for(int end = 0; end < nums.length; end++){
            while(nums[end] - nums[start] > 1){ 
                start++;
            }
            if(nums[end] - nums[start] == 1){ //if we do happen to find the subarray:
                maxLen = Math.max(maxLen, end - start + 1); //end - start + 1 is to obtain size of current subarray.
            }
        }
        return maxLen; 
    }
}


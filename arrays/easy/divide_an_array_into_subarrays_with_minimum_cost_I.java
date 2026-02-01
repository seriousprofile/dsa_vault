//HINT: first ele is always counted. and you cannot sort the ENTIRE array. 

class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];

        Arrays.sort(nums, 1, nums.length);

        return nums[1] + nums[2] + first; 
        
    }
}

// hint: circle -> 2 linear cases, 1 DP, return max. 

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        return Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n -1 ));
    } 

  //break the problem into two cases so that you calculate the max from each case and then calculate the max overall!!
    private int robLinear(int nums[], int start, int end){
        int prev1 = 0, prev2 = 0; 
        for(int i = start; i <= end; i++){
            int temp = prev1; 
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp; 
        }
        return prev1; 
    }
}

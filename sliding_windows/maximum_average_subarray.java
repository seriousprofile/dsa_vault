class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length; 

        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int maxSum = prefix[k - 1];
        for(int i = k; i < n; i++){
            int currSum = prefix[i] - prefix[i - k];
            if(currSum > maxSum){
                maxSum = currSum; 
            }
        }
        return (double) maxSum / k;
    }
}

// 1 12 -5 -6 50 3 
// -6 -5 1 3 12 50 


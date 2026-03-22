class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subarrayCount(nums, k) - subarrayCount(nums, k - 1);
    }

    private int subarrayCount(int[] nums, int k){
        int odd_count = 0; 
        int subarrays = 0;  
        int left = 0; 

        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 != 0){
                odd_count++;
            }

            while(odd_count > k){
                if(nums[left] % 2 != 0){
                    odd_count--;
                }
                left++;
            }

            subarrays += right - left + 1;
        }
        return subarrays;
    }
}

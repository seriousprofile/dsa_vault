//HINT: remember what exactly you need to keep track of!

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int maxLen = 0; 
        int zeroes = 0; 

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeroes++; //keep track of zeroes!

            //until zeroes count is more than k,
            while(zeroes > k){
                if(nums[start] == 0){ //check if the number is a zero...
                    zeroes--;
                }
                start++; //...otherwise shrink your window!
            }

            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen; 
    }
}

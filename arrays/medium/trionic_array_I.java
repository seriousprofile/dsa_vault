class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length; 
        int i = 0;

        if(n < 4) return false; 

        //increasing part of array:
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        if(i == 0) return false; 

        //decreasing part of array: 
        int descent = i; 
        while(i < n - 1 &&  nums[i] > nums[i + 1]){
            i++;
        }
        if(descent == i) return false; 

        //increasing part of array again: 
        int ascent = i;
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        if(ascent == i) return false; 

        return i == n - 1;
    }
}

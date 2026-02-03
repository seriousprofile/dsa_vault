// HINT: array is strictly increasing -> decreasing -> increasing again

class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length; 
        int i = 0;

        if(n < 4) return false; 

        //increasing part of array:
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        if(i == 0) return false; // if the i hasnt moved, it means that it is not in increasing order.

        //decreasing part of array: 
        int descent = i; 
        while(i < n - 1 &&  nums[i] > nums[i + 1]){
            i++;
        }
        if(descent == i) return false;  // if i hasnt moved, it means that it is not in decreasing order. 

        //increasing part of array again: 
        int ascent = i;
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        if(ascent == i) return false; // if i hasnt moved, it means that it is not in increasing order again. 

        return i == n - 1;
    }
}

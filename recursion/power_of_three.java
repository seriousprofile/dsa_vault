//you should know by now >:(

class Solution {
    public boolean isPowerOfThree(int n) {
        //base case: (what we are expecting the sub problems to lead to:)
        if(n == 1) return true; 
        if(n <= 0 || n % 3 != 0) return false; 

        return isPowerOfThree(n / 3);
    }
}

// HINT: 2^0 = 1 that's literally it 

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n <= 0 || n % 2 != 0) return false;

        return isPowerOfTwo(n / 2); 
        //the logic here is that n keeps dividing itself until it is equal to 1. when it reaches the base case, it proves that the number is indeed a power of two and hence returns true.
    }
}

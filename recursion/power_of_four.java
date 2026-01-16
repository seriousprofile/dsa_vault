//HINT: 4^k = 1

class Solution {
    public boolean isPowerOfFour(int n) {
        //base case:
        if(n == 1) return true; 
        if(n <= 0 || n % 4 != 0) return false; 

        return isPowerOfFour(n / 4); 
        //divide n by 4 repeatedly until we reach base case 1 if it is actually a power of the number. 
    }
}

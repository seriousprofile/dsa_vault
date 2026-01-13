class Solution {
    public int climbStairs(int n) {

      //upto 2, you will notice that it will always return the same number;
        if(n <= 2) return n;

      //declare first as 1 and second as 2 as they are base cases and we always start from here
        int first = 1, second = 2; 

      //run the loop starting from n = 3 as it will start changing
        for(int i = 3; i <= n; i++){

          //this follows fibonacci's sequence where number = ways(n - 1) + ways(n - 2);
            int third = first + second; 

          //update the variables so that when the n increments, so do the n - 1 and n - 2 values. 
            first = second;  
            second = third; 
        }
        return second; 
    }
}

// hint: combinatorics formula. for any cell [i][j]:
// dp [i][j] = dp[i - 1][j] + dp[i][j - 1];
//this logic applies only when you can only move right or down (restricted access) 

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //fill first row and col with 1s
        for(int i = 0; i < m; i++) dp[i][0] = 1; 
        for(int j = 0; j < n; j++) dp[0][j] = 1; 

        //fill the rest of the grids
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1]; //this is the last cell. 
        //remember last cell always returns max no. of paths!
    }
}

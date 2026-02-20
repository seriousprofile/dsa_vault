//HINT: check the conditions given in the question. 

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        //declare an array of size n all filled with 1s. 
        int[] candies = new int[n];
        Arrays.fill(candies, 1); 

        //compare the LEFT neighbors 
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i - 1]){
                candies[i] = candies[i - 1] + 1; 
            }
        }

        //compare the RIGHT neighbors
        for(int i = n - 2; i >= 0; i--){ //think: why'd we start with 1 in first loop? 
            if(ratings[i] > ratings[i + 1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
                //left pass is all good, but right pass might accidentally
                //revert your number back to a lower one!! 
                //for context, do a dry run for case: [1 3 4 5 2]
            }
        }

        int sum = 0; 
        for(int num : candies){
            sum += num; 
        }

        return sum; 
    }
}

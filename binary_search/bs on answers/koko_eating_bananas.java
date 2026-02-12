class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; //minimum valid speed cannot be 0 
        int high = 0; //will be updated later

        for(int pile : piles){
            high = Math.max(high, pile); //find max pile
        }

        while(low < high){
            int mid = low + (high - low) / 2; 
            long hours = 0;

          //calculate hours needed at speed = mid 
            for(int pile : piles){
                hours += (pile + mid - 1) / mid;  //ceil division (basically rounding off)
            }

            if(hours <= h){
                high = mid; //try smaller speed 
            } else {
                low = mid + 1; //try higher speed 
            }
        }
        return low; 
    }
}

/*
3 6 7 11, h = 8 

*/

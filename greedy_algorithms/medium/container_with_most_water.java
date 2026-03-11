//HINT: determine how to compute length and breadth.

class Solution {
    public int maxArea(int[] height) { 
        int max_area = Integer.MIN_VALUE; 

        int i = 0; 
        int j = height.length - 1; 

        while(i < j){
            int breadth = Math.min(height[i], height[j]);
            int length = Math.abs(i - j);

            max_area = Math.max((length * breadth), max_area); 

            //MOVE THE SHORTER HEIGHT
            if(height[i] > height[j]){
                j--;
            } else {
                i++;
            }

        }

        return max_area; 
    }
}

/*
1 8 6 2 5 4 8 3 7 

*/

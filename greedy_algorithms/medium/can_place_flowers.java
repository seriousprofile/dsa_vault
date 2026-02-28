// check if the current plot can be 1 or not.

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length; 
        if(len < n) return false; 

        for(int i = 0; i < len; i++){
            if(flowerbed[i] == 0){
                boolean leftEmpty = (i == 0) || flowerbed[i - 1] == 0;
                boolean rightEmpty = (i == len - 1) || flowerbed[i + 1 ] == 0;
                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1; 
                    n--;

                    if(n == 0) return true; 
                }
            }
        }

        return n <= 0; 
    }
}

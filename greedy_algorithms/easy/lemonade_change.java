// HINT: just deal with the 5s and 10s. think abt the edge cases too.

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0; 
        int tens = 0; 
        int twenties = 0; 
        boolean check = false; 

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fives++; 
            } else if(bills[i] == 10){
                if(fives == 0) return false; 
                tens++;
                fives--;
            } else {
                if(tens > 0 && fives > 0){
                    tens--; 
                    fives--;
                } else if (fives >= 3){
                    fives = fives - 3; 
                } else {
                    return false; 
                }
            }
        }

        return true;
    }
}
/*
5 5 5 10 20 
*/

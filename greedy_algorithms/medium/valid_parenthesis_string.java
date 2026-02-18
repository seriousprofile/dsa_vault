class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; 
        int maxOpen = 0; 

        for(char c : s.toCharArray()){
            //if it is (
            if(c == '('){
                minOpen++;
                maxOpen++;
            } else if (c == ')'){
                minOpen--;
                maxOpen--;
            } else {
                minOpen--; //best case scenario: if it is ) we can close!
                maxOpen++; //worst case scenario: if it is another ( we add.
            }

            if(minOpen < 0){
                minOpen = 0; //we cannot have negative amt of parentheses!!
            }

            if(maxOpen < 0){
                return false; //means there are more closing brackets
            }
        }

        return minOpen == 0; //basic case to check if there's any min 
        //brackets left. if there are, then it basically means the string is 
        //invalid. 
    }
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char letter = letters[0]; //default
        int n = letters.length; 

        for(int i = 0; i < letters.length; i++){ 
            if(letters[i] > target){ //only case to check is if the letter is greater than target. 
                letter = letters[i];
                break; //break instead of looping till the end!!
            }
        }
        return letter; 
    }
}


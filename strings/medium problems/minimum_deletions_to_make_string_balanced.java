class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0; 
        int deletions = 0; 

        for(char c : s.toCharArray()){
            if(c == 'b'){ //if char is b
                bCount++; //count them.
            } else if (c == 'a'){ //however, if char is a
                deletions = Math.min(deletions + 1, bCount); //either delete the a or delete all the letters b. 
            }
        }
        return deletions; 
    }
}

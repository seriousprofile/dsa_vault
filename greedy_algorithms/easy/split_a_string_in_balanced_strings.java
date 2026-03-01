// YOU ALMOST GOT THIS ONE GG

class Solution {
    public int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;
        int ssCount = 0;

        int i = 0;
        int j = i + 1; 

        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                rCount++;
            } else {
                lCount++;
            }

            if(rCount > 0 && lCount > 0 && rCount == lCount){
                ssCount++;
                rCount = 0; 
                lCount = 0; 
            }
        }

        return ssCount; 
    }
}

//R L R R L L R L R L 

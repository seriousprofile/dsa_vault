// same algo that was applied in valid parentheses problem (stacks)

class Solution {
    public int maxDepth(String s) {
        int open = 0; 
        int maxCount = 0; 

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            } else if (s.charAt(i) == ')'){
                open--;
            }
            maxCount = Math.max(open, maxCount);
        }
        return maxCount; 
    }
}


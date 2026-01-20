//HINT: the key word here is duplicates. when you want to get rid of dupes, you use ___.

class Solution {
    public int lengthOfLongestSubstring(String s) {

      //declare relevant variables
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int maxCount = 0; 

        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){ //if the character already exists 
                set.remove(s.charAt(start)); //reduce the window by incrementing start (and removing the character!!)
                start++;
            }
            set.add(s.charAt(i)); 
            maxCount = Math.max(maxCount, i - start + 1); //always remember that end - start + 1 gives you window length.
        }
        return maxCount; 
    }
}

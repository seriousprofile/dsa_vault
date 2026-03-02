// HINT : stack pattern + frequency 

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26]; //character appearance count 
        boolean[] inStack = new boolean[26]; //is it in result? 

        StringBuilder sb = new StringBuilder(); //stack for this problem :)

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        } //count the frequencies of all chars 

        for(char c : s.toCharArray()){
            int idx = c - 'a'; 
            freq[idx]--; //reduce the frequency 

            //if inStack == true which means it's in sb, then 
            //we dont need recurring chars, so skip.
            if(inStack[idx]) continue; 

            //otherwise:
            while(sb.length() > 0){

                //first compare the last letter in sb:
                char last = sb.charAt(sb.length() - 1);

                //if the char is greater than curr and it appears again 
                // we can definitely remove it and add it later. 
                if(last > c && freq[last - 'a'] > 0){
                    inStack[last - 'a'] = false; 
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    break; 
                }
            }

            //after deletion, append the current char since it is smaller 
            // and change the flag to true as it is present in sb. 
            sb.append(c);
            inStack[idx] = true; 
        }

        //now return sb. 
        return sb.toString();
    }
}

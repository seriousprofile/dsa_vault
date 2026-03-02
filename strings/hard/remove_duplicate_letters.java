class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] inStack = new boolean[26];

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : s.toCharArray()){
            int idx = c - 'a';

            freq[idx]--;

            if(inStack[idx]) continue; 

            while(sb.length() > 0){
                char last = sb.charAt(sb.length() - 1);

                if(last > c && freq[last - 'a'] > 0){
                    inStack[last - 'a'] = false; 
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    break; 
                }
            }

            sb.append(c);
            inStack[idx] = true; 
        }

        return sb.toString();
    }
}

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();

        char[] ans = new char[s.length()];
        Arrays.fill(ans, '\0');

        char[] trav = s.toCharArray();

        for(int i = 0; i < trav.length; i++){
            if(isVowel(trav[i])){
                sb.append(trav[i]);
            } else {
                ans[i] = trav[i];
            }
        }
        
        sb.reverse();

        int v = 0;
        for(int i = 0; i < ans.length; i++){
            if(ans[i] == '\0'){
                ans[i] = sb.charAt(v++);
            }
        }

        return new String(ans);

    }

    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1; 
    }
}

// IceCreAm

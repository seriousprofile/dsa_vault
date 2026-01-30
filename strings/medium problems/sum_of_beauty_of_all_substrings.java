// HINT: freq array + double loop traversal 

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0; 

        for(int i = 0; i < n; i++){
            int[] freq = new int[26]; //create an array of size 26 for all alphabets to store n elements

            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++; //update the freq array with the frequency values accordingly. 

                int maxFreq = 0; 
                int minFreq = Integer.MAX_VALUE; //declare a max and min value to compare to.

                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){ //update the min and max values by comparing
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    } 
                }

                totalBeauty += (maxFreq - minFreq); //calculate totalBeauty variable with final values. 
            }
        }
        return totalBeauty; 
    }
}

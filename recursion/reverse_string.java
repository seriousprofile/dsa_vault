class Solution {
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }

    private void reverseHelper(char[] s, int left, int right){
        if(left >= right){
            return; 
        } //in case the pointer has already crossed, just return 

      //basic swapping technique:
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp; 

      //call the helper function again to perform the swapping but this time for the rest of the elements in an order:
        reverseHelper(s, left + 1, right - 1);
    }
}

// HINT: MAP AND TRACK!!!!!

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        //put all the val into the map
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //declare the sum variable to keep track
        int sum = 0; 

        for(int i = 0; i < s.length(); i++){
            int curr = map.get(s.charAt(i)); 

            //the first condition is so that you make sure youre not the 
            // last character so it doesnt give index out of bounds error. 
            if(i < s.length()- 1 && curr < map.get(s.charAt(i + 1))){
                sum -= curr; 
            } else {
                sum += curr; 
            }
        }

        return sum; 
    }
}

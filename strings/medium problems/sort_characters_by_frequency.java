//HINT: map -> sort list

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

      //store value in hashmap
        for (char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : list){
            char ch = entry.getKey();
            int val = entry.getValue();

            for(int i = 0; i < val; i++){
            sb.append(ch);
        }
        }

        return sb.toString();
    }
}

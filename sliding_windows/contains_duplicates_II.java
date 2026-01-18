//HINT: hashmap
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

      //the logic here is to simply just check for similar key val in the hashmap 
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i]) && i - hm.get(nums[i]) <= k){
                return true; 
            }
            hm.put(nums[i], i);
        }
        return false; 
    }
}

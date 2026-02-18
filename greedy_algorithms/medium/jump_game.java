//HINT: whats the farthest you can reach? 

class Solution {
    public boolean canJump(int[] nums) { 
        int farthest = 0; 

        for(int i = 0; i < nums.length; i++){

            //if you cant reach this index (i)
            if(i > farthest){
                return false; //...you're stuck. because farthest is the 
                // only index you can go upto.  
            }

            //let's maximize my jump range!!
            farthest = Math.max(farthest, i + nums[i]);
        }

        return true;
    }
}

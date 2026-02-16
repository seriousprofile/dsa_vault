class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        int greedyCount = 0; 

        Arrays.sort(s);
        Arrays.sort(g);

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                greedyCount++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return greedyCount;
    }
}

class Solution {
    public int longestNiceSubarray(int[] nums) {
        int mask = 0;
        int s = 0;
        int res = 0;
        for(int e = 0; e < nums.length; e++){
            while((mask & nums[e]) != 0) {
                mask ^= nums[s++];
            }
            mask |= nums[e];
            res = Math.max(res, e-s+1);
        }
        return res;
    }

}
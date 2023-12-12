public class Solution {

    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxSize = 1;
        int left = 0;
        int mask = 0;
        for (int right = 0; right < n; right++) {
            while ((mask & nums[right]) !=0){
                mask ^= nums[left];
                left++;
            }
            mask |= nums[right];
            maxSize = Math.max(maxSize, right - left + 1);
                    }
        return maxSize;
    }
}
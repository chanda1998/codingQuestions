class Solution {
    public int longestOnes(int[] nums, int k) {
        int st = 0, en = 0;
        int maxLen = 0;
        if(nums.length < k) return nums.length;
        int countZero = 0;
        while(en < nums.length){
            if(nums[en] == 0) countZero++;
            while(countZero > k){
                maxLen = Math.max(en - st , maxLen);
                if(nums[st++] == 0) countZero--;
            }
            en++;
        }
        return Math.max(maxLen, en - st);
    }
}

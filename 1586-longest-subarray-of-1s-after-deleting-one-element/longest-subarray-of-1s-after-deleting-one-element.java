class Solution {
    public int longestSubarray(int[] nums) {
        int count= 0;
        int zeros = 0;
        int left = 0;
        int right;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeros++;
            }
            while(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            count = Math.max(count,right-left);
        }
        return count;
    }
}
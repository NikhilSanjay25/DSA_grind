class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for(int num:nums){
            total+=num;
        }
        int count = 0;
        int sum = 0;
        for(int i = 0;i<nums.length-1;i++){
            int num = nums[i];
            total-=num;
            sum += num;
            if((Math.abs(total-sum)%2)==0){
                count++;
            }
        }
        return count;
    }
}
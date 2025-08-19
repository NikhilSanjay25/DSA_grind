class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long op = 0;
        long count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                op = op + (count*(count+1)/2);
                count = 0;
            }
        }
        op = op + (count*(count+1)/2); 
        return op;
    }

}
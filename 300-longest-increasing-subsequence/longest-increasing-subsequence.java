class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> op = new ArrayList<>();
        op.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int index = Collections.binarySearch(op,nums[i]);
            if(index<0){
                index = -index - 1;
                if(index==op.size()){
                    op.add(nums[i]);
                }
                else{
                op.set(index, nums[i]);
                }
            }
            else{
                if(index==op.size()){
                    op.add(nums[i]);
                }
                else{
                    op.set(index, nums[i]);
                }
            }

        }
        return op.size();
    }
}
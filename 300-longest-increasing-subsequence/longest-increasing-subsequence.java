class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> op = new ArrayList<>();
        op.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(op.get(op.size()-1)<nums[i]){
                op.add(nums[i]);
            }
            else{
                int pointer = Collections.binarySearch(op,nums[i]);
                if(pointer<0){
                    pointer = -(pointer)-1;
                }
                if(nums[i]<op.get(pointer)){
                    op.set(pointer,nums[i]);
                }
            }
        }
        return op.size();
    }
}
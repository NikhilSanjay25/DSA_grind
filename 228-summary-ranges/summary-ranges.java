class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> op = new ArrayList<>();
        if(nums.length==0){
            return op;
        }
        int prev = nums[0];
        int start = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if((nums[i]-1)==prev){
                prev = nums[i];
            }
            else{
                if(prev==start){
                    op.add(String.valueOf(start));
                }
                else{
                    op.add(String.valueOf(start)+"->"+String.valueOf(prev));
                }
                start = nums[i];
                prev =  nums[i];
            }
            
        }
        if(prev==start){
            op.add(String.valueOf(start));
        }
        else{
            op.add(String.valueOf(start)+"->"+String.valueOf(prev));
        }
        return op;
            
    }
}
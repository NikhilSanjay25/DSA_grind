class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        Deque<Integer> stack= new ArrayDeque<>();
        stack.push(0);
        for(int i:nums){
            while(!stack.isEmpty() && stack.peek()>i){
                stack.pop();
            }
            if(stack.isEmpty() || stack.peek()<i){
                stack.push(i);
                count++;
            }
        }
        return count;
    }

}
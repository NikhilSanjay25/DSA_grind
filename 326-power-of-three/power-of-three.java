class Solution {
    public boolean isPowerOfThree(int n) {
        for(long j=1;j<Integer.MAX_VALUE;j=j*3){
            if(j==n){
                return true;
            }
        }
        return false;
    }
}
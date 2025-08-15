class Solution {
    public boolean isPowerOfFour(int n) {
        for(long j=1;j<Integer.MAX_VALUE;j=j*4){
            if(n==j){
                return true;
            }
        }
        return false;
    }
}
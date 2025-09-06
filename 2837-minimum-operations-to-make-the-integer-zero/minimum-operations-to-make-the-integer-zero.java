class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(long k=1;k<=60;k++){
            long count = (long)num1 - (long)num2*k;
            if(k>count){
                continue;
            }
            if(Long.bitCount(count)<=k){
                return (int)k;
            }
            
        }
        return -1;
    }
}
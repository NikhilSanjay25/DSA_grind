class Solution {
    public int concatenatedBinary(int n) {
        long op = 1;
        long mod = 1000000007;
        int bits = 1;
        for(int i=2;i<=n;i++){
            if((i&(i-1))==0){
                bits++;
            }
            op=((op<<bits)+i)%mod;
        }
        return (int)op;
    }
}
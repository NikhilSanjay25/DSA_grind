class Solution {
    public int concatenatedBinary(int n) {
        int op = 1;
        for(int i=2;i<=n;i++){
            String a = Integer.toBinaryString(i);
            for(int j=0;j<a.length();j++){
                op=op<<1;
                op = op%1000000007;
            }
            op+=i;
        }
        return op;
    }
}
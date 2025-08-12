class Solution {
    public int numberOfWays(int n, int x) {
        long[] arr = new long[n+1];
        arr[0] = 1;
        for(int i=1;Math.pow(i,x)<=n;i++){
            int pow =(int) Math.pow(i,x);
            for(int sum = n;sum>=pow;sum--){
                arr[sum]= (arr[sum]+arr[sum-pow])%1_000_000_007;
            }
        }
        return (int) arr[n];
    }
}
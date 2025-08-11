class Solution {
    public int[] productQueries(int n, int[][] queries) {
        String binary = Integer.toBinaryString(n);
        int[] arr = new int[binary.length()];
        int p =0;
        int pow2 =1 ;
        for(int i=binary.length()-1;i>-1;i--){
            if(binary.charAt(i)=='1'){
                arr[p]=pow2;
                p++;
            }
            pow2=pow2*2;
        }
        int[] op = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            long sum = 1;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                sum =(long) sum * (long)arr[j]%1000000007;
            }
            op[i] =(int) sum%1000000007;
        }
        return op;

    }
}
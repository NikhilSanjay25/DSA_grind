class Solution {
    public long flowerGame(int n, int m) {
        long oddn = 0;
        long evenn = 0;
        long oddm = 0;
        long evenm = 0;
        if(n%2==0){
            oddn = (n/2);
            evenn = n - oddn;
        }
        else{
            oddn = (n/2) +1;
            evenn = n - oddn;
        }
        if(m%2==0){
            oddm = (m/2);
            evenm = m - oddm;
        }
        else{
            oddm = (m/2) +1;
            evenm = m - oddm;
        }
        return (long)(evenn*oddm + evenm*oddn);
    }
}
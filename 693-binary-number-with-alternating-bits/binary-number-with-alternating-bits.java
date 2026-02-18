class Solution {
    public boolean hasAlternatingBits(int n) {
        Set<Integer> set = new HashSet<>();
        int a = 1;
        set.add(a);
        set.add(2);
        for(int i=0;i<32;i++){
            a = a<<1;
            if(i%2==1){
                a=a+1;
            }
            if(a < Integer.MAX_VALUE){
                set.add(a);
            }
        }
        return set.contains(n);
    }
}
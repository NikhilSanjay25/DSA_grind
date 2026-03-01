class Solution {
    public int minPartitions(String n) {
        int op = 0;
        for(int i=0;i<n.length();i++){
            op = Math.max(op,n.charAt(i)-'0');
        }
        return op;
    }
}
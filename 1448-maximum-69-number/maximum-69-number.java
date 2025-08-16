class Solution {
    public int maximum69Number (int num) {
        boolean flag = true;
        String nu = Integer.toString(num);
        String op="";
        for(int i=0;i<nu.length();i++){
            if(flag && nu.charAt(i)=='6'){
                op = op + "9";
                flag = false;
            }
            else{
                op = op + nu.charAt(i);
            }
        }
        return Integer.parseInt(op);
        
    }
}
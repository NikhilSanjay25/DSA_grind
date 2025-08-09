class Solution {
    public String convert(String s, int numRows) {
        char[][] arr = new char[numRows][s.length()];
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        int r =0;
        int c = 0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            arr[r][c]=s.charAt(i);
            if(flag){
                r++;
                if(r==numRows-1){
                    flag = false;
                }
            }
            else{
                r--;
                c++;
                if(r==0){
                    flag =true;
                }
            }

        }
        String sop = "";
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(arr[i][j]!='\u0000'){
                    sop=sop+arr[i][j];
                }
            }
        }
        return sop;
    }
}
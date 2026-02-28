class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0){
            return "";
        }
        if(s.length() == 1)
        {
            return s;
        }
        int opl = 0;
        int opr = 0;
        for(int i=0;i<s.length();i++){
            int left = i;
            int right =  i+1;
            while(left>=0 && right <= s.length()-1){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }
                else{
                    if(opr-opl+1<right-left-1){
                        opl = left+1;
                        opr = right-1;
                    }
                    break;
                }
            }
            if((right - 1) - (left + 1) > (opr - opl)){
                opl = left + 1;
                opr = right - 1;
            }

        }
        for(int i=0;i<s.length();i++){
            int left = i-1;
            int right =  i+1;
            while(left>=0 && right <= s.length()-1){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }
                else{
                    if(opr-opl+1<right-left-1){
                        opl = left+1;
                        opr = right-1;
                    }
                    break;
                }
            }
            if((right - 1) - (left + 1) > (opr - opl)){
                opl = left + 1;
                opr = right - 1;
            }

        }
        if(opr-opl==0){
            s.substring(0,1);
        }
        return s.substring(opl,opr+1);
    }
}
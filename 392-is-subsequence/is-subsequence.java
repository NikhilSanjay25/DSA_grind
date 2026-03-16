class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer1=0;
        int pointer2=0;
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<s.length();i++){
            pointer1=i;
            pointer2=0;
            while(pointer1<t.length()){
                if(t.charAt(pointer1)==s.charAt(pointer2)){
                    pointer1++;
                    pointer2++;
                    if(pointer2==s.length()){
                        return true;
                    }
                }
                else{
                    pointer1++;
                }
            }
        }
        return false;
    }
}
class Solution {
    public boolean isValid(String s) {
        while(true){
            boolean test = false;
            for(int i=0;i<=s.length()-3;i++){
                if(s.substring(i,i+3).equals("abc")){
                    s = s.substring(0,i)+s.substring(i+3,s.length());
                    test = true;
                    break;
                }
            }
            if(test){
                continue;
            }
            else{
                break;
            }
        }
        return s.length()==0;
    }
}
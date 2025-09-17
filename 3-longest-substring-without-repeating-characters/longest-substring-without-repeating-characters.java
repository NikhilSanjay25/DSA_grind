class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] arr = new int[128];
       if(s.length()==1){
        return 1;
       }
       int left = 0;
       int max =0;
       int right=0;
       for(right=0;right<s.length();right++){
            if(arr[(int) s.charAt(right)]==1){
                max = Math.max(right-left+1,max);
                while(left<=right){
                    arr[(int) s.charAt(left) ]-=1;
                    if(arr[(int) s.charAt(right) ]==0){
                        arr[(int) s.charAt(right) ]+=1;
                        left++;
                        break;
                    }
                    left++;
                }  
            }
            else{
                arr[(int) s.charAt(right) ]+=1;
            }
       }
       return Math.max(max,right-left+1)-1;
    }
}
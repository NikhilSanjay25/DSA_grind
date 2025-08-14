class Solution {
    public String largestGoodInteger(String num) {
        int count =1;
        int num1=-1;
        for(int i=1;i<num.length();i++){
            if(num.charAt(i-1)==num.charAt(i)){
                count++;
                if(count==3){
                  num1 = Math.max(num1,num.charAt(i)-'0');
                }
                continue;
            }
            else{
                count = 1;
            }
        }
        if(num1 == -1){
            return "";
        }
        else{
            return String.valueOf(num1)+String.valueOf(num1)+String.valueOf(num1);
        }

    }
}
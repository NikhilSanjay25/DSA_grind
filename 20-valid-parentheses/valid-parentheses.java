class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> op = new ArrayList<>();
        if(s.length()==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(op.size()!=0 && ((s.charAt(i)=='}' && op.get(op.size()-1)=='{') || (s.charAt(i)==')' && op.get(op.size()-1)=='(') || (s.charAt(i)==']' && op.get(op.size()-1)=='['))){
                op.remove(op.size()-1);
            }
            else{
                op.add(s.charAt(i));
            }
        }
        return op.size()==0;
    }
}
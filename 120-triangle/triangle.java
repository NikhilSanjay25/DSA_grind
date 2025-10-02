class Solution {
    int sum = Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
       for(int i=1;i<triangle.size();i++){
            for(int j = 0;j<triangle.get(i).size();j++){
                int val = triangle.get(i).get(j);
                if(j==0){
                    triangle.get(i).set(j,val+triangle.get(i-1).get(j));
                }
                else if(j==triangle.get(i).size()-1){
                    triangle.get(i).set(j,val+triangle.get(i-1).get(j-1));
                }
                else{
                    triangle.get(i).set(j,Math.min(val+triangle.get(i-1).get(j-1),val+triangle.get(i-1).get(j)));
                }
            }
       }
       int min = triangle.get(triangle.size()-1).get(0);
       for(int k=0;k<triangle.get(triangle.size()-1).size();k++){
            min = Math.min(min,triangle.get(triangle.size()-1).get(k));
       }
       return min;
    }
}
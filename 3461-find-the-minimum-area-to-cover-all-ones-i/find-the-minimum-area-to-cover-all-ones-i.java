class Solution {
    public int minimumArea(int[][] grid) {
        int top = Integer.MAX_VALUE;
        int bottom = 0;
        int left =Integer.MAX_VALUE;
        int right = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    top = Math.min(i,top);
                    bottom = Math.max(i,bottom);
                    left = Math.min(left,j);
                    right = Math.max(right,j);
                }
            }
        }
        return (right-left+1)*(bottom-top+1);
    }
}
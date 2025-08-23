class Solution {
    public int numSubmat(int[][] mat) {
       int n = mat.length;
       int m = mat[0].length;
       
       int[][] arr = new int[n][m];
       for(int i=0;i<n;i++){
        int c = 0;
            for(int j=m-1;j>=0;j--){
                if(mat[i][j]==1){
                    c++;        
                }
                else{
                    c=0;
                }
                arr[i][j]=c;
            }
       }
       
       int op =0;
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int min = Integer.MAX_VALUE;
                for(int k =i;k<n;k++){
                    min = Math.min(min,arr[k][j]);
                    op+=min;
                }
            }
       }
       return op;
    }
}
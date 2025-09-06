class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0 ;
        int right = m*n-1;
        while(right>=left){
            int mid = (right+left)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            if(matrix[mid/m][mid%m]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;

    }
}
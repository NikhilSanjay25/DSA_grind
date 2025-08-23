class Solution {
    public int countSquares(int[][] mat) {
         int count= 0;
        for(int i=0;i<mat.length;i++){    
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                    count +=rec(i,j,mat);
                }
            }
        }
        return count;
    }
    private static int rec(int i, int j, int[][] mat) {
    int n = mat.length, m = mat[0].length;
    int maxSize = Math.min(n - i, m - j); // maximum square size from (i,j)
    int count = 0;

    for (int size = 2; size <= maxSize; size++) { // start from 2x2 squares
        boolean flag = true;

        for (int r = i; r < i + size; r++) {
            for (int c = j; c < j + size; c++) {
                if (mat[r][c] == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }

        if (flag) {
            count++;
        } else {
            break; // once a square fails, larger ones will also fail
        }
    }

    return count;
}

}
import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0, dir = 1; // dir = 1 (up-right), -1 (down-left)
        
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];
            
            if (dir == 1) { // moving up-right
                if (c == n - 1) { // last col → move down
                    r++;
                    dir = -1;
                } else if (r == 0) { // first row → move right
                    c++;
                    dir = -1;
                } else { // normal case
                    r--;
                    c++;
                }
            } else { // moving down-left
                if (r == m - 1) { // last row → move right
                    c++;
                    dir = 1;
                } else if (c == 0) { // first col → move down
                    r++;
                    dir = 1;
                } else { // normal case
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}

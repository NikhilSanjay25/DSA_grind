class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int number1 = 0;
                int number2 = 0;
                if(mat[i][j]==1){
                    for(int i1 = 0;i1<mat.length;i1++){
                        if(i1==i){
                            continue;
                        }
                        if(mat[i1][j]==1){
                            number1++;
                            break;
                        }
                    }
                    for(int i1 = 0;i1<mat[0].length;i1++){
                        if(i1==j){
                            continue;
                        }
                        if(mat[i][i1]==1){
                            number2++;
                            break;
                        }
                    }
                    if(number1==0 && number2==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
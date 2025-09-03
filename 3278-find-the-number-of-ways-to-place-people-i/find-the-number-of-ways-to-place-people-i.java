class Solution {
    public int numberOfPairs(int[][] points) {
        int count = 0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                if(points[i][0]<= points[j][0] && points[i][1]>=points[j][1]){
                    int c = 0;
                    for(int k=0;k<points.length;k++){
                        if((points[k][0]>=points[i][0] && points[k][0]<=points[j][0]) && points[k][1]>=points[j][1] && points[k][1]<=points[i][1]){
                            c++;
                        }
                    }
                    c = c-2;
                    if(c==0){
                        count++;
                    }
                }
                else if(points[j][0]<= points[i][0] && points[j][1]>=points[i][1]){
                    int c =0;
                    for(int k=0;k<points.length;k++){
                        if((points[k][0]<=points[i][0] && points[k][0]>=points[j][0]) && points[k][1]<=points[j][1] && points[k][1]>=points[i][1]){
                            c++;
                        }
                    }
                    c = c-2;
                    if(c==0){
                        count++;
                    }
                }
                else{
                    continue;
                }
            }
           
        }
        return count;
    }

}
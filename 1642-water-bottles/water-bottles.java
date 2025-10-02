class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = 0;
        int op = 0;
        while(true){
            op = op + numBottles;
            empty = empty + numBottles;
            numBottles = (empty/numExchange) ;
            empty = empty - numBottles*numExchange;
            if(empty <= numExchange && numBottles ==0){
                break;
            }
        }
        return op;
    }
}
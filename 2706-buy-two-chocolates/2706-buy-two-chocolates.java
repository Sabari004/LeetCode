class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(min1>prices[i]){
                min2=min1;
                min1=prices[i];
            }
            else if(min2>prices[i]){
                min2=prices[i];
            }
        }
        return min1+min2<=money?money-(min1+min2):money;
    }
}
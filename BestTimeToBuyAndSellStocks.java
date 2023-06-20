/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class BestTimeToBuyAndSellStock {
    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int ans = obj.maxProfit(prices);
        System.out.println(ans);
    }
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            } else if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            } 
        }
        return maxProfit; 
}
}
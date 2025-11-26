package top;

public class BestTimeBuySell {

    public static int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            if (profit < prices[i] - buy) {
                profit = prices[i] - buy;
            }
        }

        return profit;

    }

    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(maxProfit(prices));
    }
}

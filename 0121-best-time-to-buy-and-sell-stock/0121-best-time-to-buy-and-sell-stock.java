class Solution {
    public int maxProfit(int[] prices) {

        // Store the minimum buying price seen so far.
        // Initialize with the largest possible value.
        int buyprice = Integer.MAX_VALUE;

        // Store the maximum profit found so far.
        int maxprofit = 0;

        // Traverse each day's stock price
        for (int i = 0; i < prices.length; i++) {

            // If today's price is greater than the buying price,
            // we can sell today and make a profit.
            if (prices[i] > buyprice) {

                // Calculate profit by selling today.
                int profit = prices[i] - buyprice;

                // Update the maximum profit if today's profit is higher.
                maxprofit = Math.max(maxprofit, profit);

            } else {

                // Found a lower price, so update the buying price.
                // This gives us a better opportunity to make more profit later.
                buyprice = prices[i];
            }
        }

        // Return the maximum profit.
        // If no profit was possible, it remains 0.
        return maxprofit;
    }
}
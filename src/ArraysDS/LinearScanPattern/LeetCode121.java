package ArraysDS.LinearScanPattern;

/** Question:
 * You are given an arrau prices where prices[i] is the stock price on day i.
 * Choose one day to buy and a later day to sell.
 * Return the maximum profit you can achieve, if no profit is possible return 0.
 *
 */

/**Main keywords:
 * Maximum Profit
 * Buy before sell  (order matters)
 * One transaction
 * */

/** Human Thinking
 * While scanning, keep the minimum price seen so far(best day to buy so far)
 * For each day, assume you sell today, then Profit wold be:
 * profitToday = prices[i] - minimumSoFar;
 * Update the global max profit
 * Update the min price
 * */

/**Psuedo Code
 * minPrice =+infinity
 * maximumProfit= 0
 *
 * for each price in prices:
 * {
 *     minPrice = Math.min(price[i], minPrice);
 *     profitToday = price[i] - minPrice;
 *     maximumProfit = Math.max(profitToday, maximumProfit);
 * }
 *
 * */

/**Time and space complexity
 * There is exactly one loop over n elements so the time complexity would be:
 * O(n).
 *
 * Shortcut - > If you see a single loop over array without nested loops then it is -> O(n)
 *
 * Space Complexity:
 * ONly a few variables are used minPrice, maxprofit, profitToday
 * No extra arrays
 * -> O(n)
 * * */

public class LeetCode121
{
	public static int maximumProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit =0;
		for(int price : prices)
		{
			minPrice = Math.min(minPrice, price);
			int profitToday = price - minPrice;
			maxProfit = Math.max(maxProfit, profitToday);
		}

		return maxProfit;
	}

	public static void main(String [] args){

		int [] arr= {10,30,20,5,65,100,105};
		int highestProfit = maximumProfit(arr);
		System.out.println(highestProfit);


	}
}

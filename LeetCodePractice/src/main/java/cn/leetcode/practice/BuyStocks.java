package cn.leetcode.practice;

import java.util.Vector;

/**
 * 
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 */
public class BuyStocks {

	public int maxProfit(int[] prices) {
		int p = 0;
		int a = 0;
		for (int i = 1; i < prices.length; i++) {
			p = prices[i] - prices[i - 1];

			if (p > 0)
				a += p;

		}

		return a;

	}
	
	public static void main(String[] args) {
		
		BuyStocks b = new BuyStocks();
		
//		int [] prices = new int[] {7,1,5,3,6,4};
		
//		int [] prices = new int[] {1,2,3,4,5};
		
		int [] prices = new int[] {7,6,4,3,1};
		
		System.out.println(b.maxProfit(prices));
	}

}

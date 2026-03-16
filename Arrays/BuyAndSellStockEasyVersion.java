/*
    You are given an array prices where price[i] is the price of the given stock on ith day. you want to maximize the profit by choosing a single day to buy one stock and 
    choosing other single day to sell the stock.

    Return the maximum profit you can achieve from this transaction. if you cannt achieve any profit return 0.


    prices[]=[7, 1, 5, 3, 6, 4];
    output = 5
*/

public class BuyAndSellStockEasyVersion {
  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };

    System.out.println(maxProfits(prices));
  }

  private static int maxProfits(int[] nums) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : nums) {
      if (price < minPrice) {
        minPrice = price;
      } else if (price - minPrice > maxProfit) {
        maxProfit = price - minPrice;
      }

    }
    return maxProfit;
  }

}
